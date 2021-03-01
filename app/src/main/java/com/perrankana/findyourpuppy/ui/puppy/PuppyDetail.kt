/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.perrankana.findyourpuppy.ui.puppy

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.perrankana.findyourpuppy.model.Puppy
import com.perrankana.findyourpuppy.puppies
import com.perrankana.findyourpuppy.ui.theme.MyTheme

@Composable
fun PuppyDetail(puppy: Puppy, action: () -> Unit) {
    val showAdoptPuppyAlertDialog: MutableState<Boolean> = remember { mutableStateOf(false) }

    ConstraintLayout {
        val (details, button) = createRefs()
        PuppyDetailCard(
            puppy = puppy,
            modifier = Modifier.constrainAs(details) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            }
        )
        Button(
            onClick = {
                showAdoptPuppyAlertDialog.value = true
            },
            modifier = Modifier.constrainAs(button) {
                bottom.linkTo(parent.bottom, margin = 12.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        ) {
            Text(text = "Adopt this puppy")
        }
    }

    if (showAdoptPuppyAlertDialog.value) {
        AdoptPuppyAlertDialog(
            puppyName = puppy.name,
            showAdoptPuppyAlertDialog = showAdoptPuppyAlertDialog,
            action = action
        )
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPuppyPreview() {
    MyTheme {
        PuppyDetail(puppies[0]) {}
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPuppyPreview() {
    MyTheme(darkTheme = true) {
        PuppyDetail(puppies[0]) {}
    }
}

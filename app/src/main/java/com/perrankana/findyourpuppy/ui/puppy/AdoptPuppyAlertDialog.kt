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

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.AlertDialog
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.perrankana.findyourpuppy.R

@Composable
fun AdoptPuppyAlertDialog(
    puppyName: String,
    showAdoptPuppyAlertDialog: MutableState<Boolean>,
    action: () -> Unit
) {
    AlertDialog(
        title = {
            Text("Congrats")
        },
        onDismissRequest = {
            showAdoptPuppyAlertDialog.value = false
        },
        text = {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Thanks for adopting $puppyName. You will receive a lot of love")
                Image(
                    painter = painterResource(id = R.drawable.ic_baseline_pets_24),
                    modifier = Modifier
                        .width(120.dp)
                        .height(120.dp)
                        .padding(top = 8.dp),
                    colorFilter = ColorFilter.tint(MaterialTheme.colors.primary),
                    contentDescription = "pet"
                )
            }
        },
        confirmButton = {
            TextButton(
                onClick = {
                    showAdoptPuppyAlertDialog.value = false
                    action()
                }
            ) {
                Text("Ok")
            }
        }
    )
}

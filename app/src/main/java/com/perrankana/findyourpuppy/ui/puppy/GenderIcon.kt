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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.perrankana.findyourpuppy.R
import com.perrankana.findyourpuppy.model.Gender
import com.perrankana.findyourpuppy.ui.theme.MyTheme

@Composable
fun GenderIcon(gender: Gender, modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier,
        shape = CircleShape,
        elevation = 2.dp,
        color = MaterialTheme.colors.primary
    ) {
        Image(
            painter = painterResource(
                when (gender) {
                    Gender.Female -> R.drawable.ic_femenine
                    Gender.Male -> R.drawable.ic_mars
                    Gender.Unknown -> R.drawable.ic_question_mark
                }
            ),
            contentDescription = gender.toString(),
            modifier = Modifier.padding(8.dp),
            colorFilter = ColorFilter.tint(Color.White)
        )
    }
}

@Preview("Light Theme", widthDp = 32, heightDp = 32)
@Composable
fun LightGenderPreview() {
    MyTheme {
        GenderIcon(gender = Gender.Male)
    }
}

@Preview("Dark Theme", widthDp = 32, heightDp = 32)
@Composable
fun DarkGenderPreview() {
    MyTheme(darkTheme = true) {
        GenderIcon(gender = Gender.Female)
    }
}

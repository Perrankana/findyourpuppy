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
package com.example.androiddevchallenge.ui.puppy

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.Gender
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.typography
import com.example.androiddevchallenge.viewmodel.PuppyListItem

@Composable
fun PuppyListCard(puppy: PuppyListItem, onClick: () -> Unit) {
    Row(
        modifier = Modifier.padding(4.dp)
    ) {
        Card(
            elevation = 4.dp,
            modifier = Modifier.clickable(onClick = onClick)
        ) {
            ConstraintLayout {
                val (image, title, description, gender) = createRefs()
                Image(
                    painter = painterResource(puppy.image),
                    contentDescription = puppy.name,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .padding(bottom = 4.dp)
                        .constrainAs(image) {
                            top.linkTo(parent.top)
                            start.linkTo(parent.start)
                        },
                    contentScale = ContentScale.Crop
                )
                GenderIcon(
                    gender = puppy.gender,
                    modifier = Modifier
                        .size(32.dp)
                        .constrainAs(gender) {
                            bottom.linkTo(image.bottom, margin = (-12).dp)
                            end.linkTo(image.end, margin = 12.dp)
                        }
                )
                Text(
                    text = puppy.name, style = typography.h6,
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .constrainAs(title) {
                            top.linkTo(image.bottom)
                        },
                    color = MaterialTheme.colors.primary
                )
                Text(
                    text = puppy.description,
                    modifier = Modifier
                        .defaultMinSize(minHeight = 60.dp)
                        .padding(start = 16.dp, bottom = 16.dp)
                        .constrainAs(description) {
                            top.linkTo(title.bottom)
                        },
                    maxLines = 2
                )
            }
        }
    }
}

@Composable
private fun dummyPuppyListCard() {
    PuppyListCard(
        puppy = PuppyListItem(
            name = "Browny",
            description = """Adult • Coonhound""",
            image = R.drawable.granny_small,
            gender = Gender.Unknown
        ),

        onClick = { /*TODO*/ }
    )
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        dummyPuppyListCard()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        dummyPuppyListCard()
    }
}

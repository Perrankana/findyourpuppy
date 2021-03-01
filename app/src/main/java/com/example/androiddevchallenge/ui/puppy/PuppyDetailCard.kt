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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.Age
import com.example.androiddevchallenge.model.Gender
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun PuppyDetailCard(puppy: Puppy, modifier: Modifier = Modifier) {
    ConstraintLayout(
        modifier = modifier.verticalScroll(rememberScrollState())
    ) {
        val (image, title, description, gender, age, spacer) = createRefs()
        Image(
            painter = painterResource(puppy.thumbnail),
            contentDescription = puppy.name,
            modifier = Modifier
                .fillMaxWidth()
                .height(320.dp)
                .constrainAs(image) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                },
            contentScale = ContentScale.Crop
        )
        GenderIcon(
            gender = puppy.gender,
            modifier = Modifier
                .size(48.dp)
                .constrainAs(gender) {
                    bottom.linkTo(image.bottom, margin = (-20).dp)
                    end.linkTo(image.end, margin = 12.dp)
                }
        )
        Text(
            text = puppy.name, style = typography.h2,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
                .constrainAs(title) {
                    top.linkTo(image.bottom)
                },
            color = MaterialTheme.colors.primary
        )
        Text(
            text = "${puppy.age.text} - ${puppy.size.text} - ${puppy.breed}",
            style = typography.h6,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
                .constrainAs(age) {
                    top.linkTo(title.bottom)
                }
        )
        Text(
            text = puppy.description,
            modifier = Modifier
                .padding(start = 16.dp, bottom = 16.dp, end = 16.dp)
                .constrainAs(description) {
                    top.linkTo(age.bottom)
                }
        )
        Spacer(
            modifier = Modifier
                .height(52.dp)
                .constrainAs(spacer) {
                    top.linkTo(description.bottom)
                }
        )
    }
}

@Composable
private fun dummyPuppyListCard() {
    Surface(color = MaterialTheme.colors.background) {
        PuppyDetailCard(
            puppy = Puppy(
                id = 0,
                name = "Browny",
                description = "Handsome CHIP is a 3 year old male coonhound. Small and compact at 40 lbs. He’s so smart and sweet. He’s a “working dog” and loves to sniff!. Chip can be a bit on the nervous side and can get a little hyper at times. He would benefit from training and someone with breed experience would be a definite plus for him! Chip is housebroken.\n",
                breed = "Coonhound",
                thumbnail = R.drawable.granny_small,
                gender = Gender.Unknown,
                age = Age.Adult
            )
        )
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPuppyCardPreview() {
    MyTheme {
        dummyPuppyListCard()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPuppyCardPreview() {
    MyTheme(darkTheme = true) {
        dummyPuppyListCard()
    }
}

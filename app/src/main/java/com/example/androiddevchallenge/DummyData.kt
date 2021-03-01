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
package com.example.androiddevchallenge

import com.example.androiddevchallenge.model.Age
import com.example.androiddevchallenge.model.Gender
import com.example.androiddevchallenge.model.Puppy

val puppies = listOf(
    Puppy(
        name = "Chip",
        shortDescription = "It's a sassy cat",
        age = Age.Adult,
        thumbnail = R.drawable.chip_small,
        breed = "Coonhound",
        gender = Gender.Male
    ),
    Puppy(
        name = "Granny",
        shortDescription = "It's a sassy cat",
        age = Age.Adult,
        thumbnail = R.drawable.granny_small,
        breed = "Pekingese & Pug Mix",
        gender = Gender.Female
    ),
    Puppy(
        name = "Miss Kitty",
        shortDescription = "It's a sassy cat",
        age = Age.Senior,
        thumbnail = R.drawable.miss_kitty_small,
        breed = "Italian Greyhound",
        gender = Gender.Female
    ),
    Puppy(
        name = "Chip",
        shortDescription = "It's a sassy cat",
        age = Age.Adult,
        thumbnail = R.drawable.chip_small,
        breed = "Coonhound",
        gender = Gender.Male
    )
)

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
import com.example.androiddevchallenge.model.Size

val puppies = listOf(
    Puppy(
        id = 0,
        name = "Chip",
        age = Age.Adult,
        thumbnail = R.drawable.chip_small,
        breed = "Coonhound",
        gender = Gender.Male,
        size = Size.Medium,
        description = "Handsome CHIP is a 3 year old male coonhound. Small and compact at 40 lbs. He’s so smart and sweet. He’s a “working dog” and loves to sniff!. Chip can be a bit on the nervous side and can get a little hyper at times. He would benefit from training and someone with breed experience would be a definite plus for him! Chip is housebroken.\n",
    ),
    Puppy(
        id = 1,
        name = "Granny",
        age = Age.Adult,
        thumbnail = R.drawable.granny_small,
        breed = "Pekingese & Pug Mix",
        gender = Gender.Female,
        size = Size.Tiny,
        description = "This sweet pretty girl is Granny. She’s about 6 years old and weighs 22 pounds and has not had an easy life. She was rescued from a Chinese Meat Festival truck. Volunteers and fosters have worked hard to get her to a comfortable point. She is improving daily. She enjoys lap time and playing outside! She’s selective with her people, and needs a patient adopter.\n" +
            "\n" +
            "She would be best in a home without young kids or men. She can’t fully get over her fear of men, so we want to set her up for success. Someone who is home a bit to work with her and continue to boost her confidence would be amazing. Your dedication and patience will be rewarded with lots of love."
    ),
    Puppy(
        id = 2,
        name = "Miss Kitty",
        age = Age.Senior,
        thumbnail = R.drawable.miss_kitty_small,
        breed = "Italian Greyhound",
        gender = Gender.Female,
        size = Size.Small,
        description = "Miss Kitty is a very sweet, well-behaved, loving senior Italian Greyhound. She is around 9 years old. She came in with her buddy Matt. Matt and Miss Kitty are very bonded, so they MUST BE PLACED TOGETHER AS A PAIR. Please give this pair a chance at a forever home. They are so full of love!"
    ),
    Puppy(
        id = 3,
        name = "Chip",
        age = Age.Adult,
        thumbnail = R.drawable.chip_small,
        breed = "Coonhound",
        gender = Gender.Male,
        size = Size.Medium,
        description = "Handsome CHIP is a 3 year old male coonhound. Small and compact at 40 lbs. He’s so smart and sweet. He’s a “working dog” and loves to sniff!. Chip can be a bit on the nervous side and can get a little hyper at times. He would benefit from training and someone with breed experience would be a definite plus for him! Chip is housebroken.\n",
    )
)

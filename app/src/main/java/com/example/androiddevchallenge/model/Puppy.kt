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
package com.example.androiddevchallenge.model

data class Puppy(
    val id: Int,
    val name: String,
    val age: Age,
    val breed: String = "Unknown",
    val gender: Gender = Gender.Unknown,
    val description: String = "",
    val size: Size = Size.Medium,
    val thumbnail: Int = 0
)

sealed class Age(val text: String) {
    object Puppy : Age("Puppy")
    object Young : Age("Young")
    object Adult : Age("Adult")
    object Senior : Age("Senior")
}

sealed class Size(val text: String) {
    object Medium : Size("Medium")
    object Small : Size("Small")
    object Tiny : Size("Tiny")
    object Large : Size("Large")
}

sealed class Gender {
    object Unknown : Gender()
    object Female : Gender()
    object Male : Gender()
}

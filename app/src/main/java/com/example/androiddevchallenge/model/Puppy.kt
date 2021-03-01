package com.example.androiddevchallenge.model

data class Puppy(
    val name: String,
    val shortDescription: String,
    val age: Age,
    val breed: String = "Unknown",
    val gender: Gender = Gender.Unknown,
    val description: String = "",
    val size: Size = Size.Medium,
    val thumbnail: Int = 0,
    val images: List<Int> = emptyList()
    )

sealed class Age(val text: String) {
    object Puppy: Age("Puppy")
    object Young: Age("Young")
    object Adult: Age("Adult")
    object Senior: Age("Senior")
}

sealed class Size {
    object Medium : Size()
    object Small : Size()
    object Tiny: Size()
    object Large: Size()
}

sealed class Gender {
    object Unknown : Gender()
    object Female: Gender()
    object Male: Gender()
}

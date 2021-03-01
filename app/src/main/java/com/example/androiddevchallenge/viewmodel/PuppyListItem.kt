package com.example.androiddevchallenge.viewmodel

import com.example.androiddevchallenge.model.Puppy

data class PuppyListItem(val name: String, val description: String, val image: Int)

fun Puppy.toListItem() : PuppyListItem = PuppyListItem(
    name = name,
    description = """${age.text} • $breed""",
    image = thumbnail
)

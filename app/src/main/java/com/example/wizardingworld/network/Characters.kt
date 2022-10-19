package com.example.wizardingworld.network

import com.squareup.moshi.Json

data class Characters(
    val name: String,
    @Json(name = "alternate_names") val altName: List<String>,
    val species: String,
    val gender: String,
    val house: String,
    val dateOfBirth: String,
    val yearOfBirth: Int?,
    val wizard: Boolean,
    val ancestry: String,
    val eyeColour: String,
    val hairColour: String,
    val wand: Wand,
    val patronus: String,
    val hogwartsStudent: Boolean,
    val hogwartsStaff: Boolean,
    val actor: String,
    @Json(name = "alternate_actors") val altActors: List<String>,
    val alive: Boolean,
    val image: String
) {
    data class Wand(
        val wood: String,
        val core: String,
        val length: Float?
    )
}

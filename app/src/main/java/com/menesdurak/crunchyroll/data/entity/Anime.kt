package com.menesdurak.crunchyroll.data.entity

data class Anime (
    val id: Int,
    val name: String,
    val image: String,
    val dubbing: Dub,
    val description: String = ""
)

enum class Dub(private val descriptor: String) {
    SUBTITLED("Subtitled"),
    DUB_SUB("Dub | Sub");

    override fun toString(): String = descriptor
}
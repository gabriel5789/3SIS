package br.com.fiap.movies.data

import java.io.Serializable

data class MovieModel(
    val name: String,
    val sinopsis: String,
    val parentalRating: String,
    val genre: String,
    val duration: String,
    val inTheathers: Boolean
) : Serializable


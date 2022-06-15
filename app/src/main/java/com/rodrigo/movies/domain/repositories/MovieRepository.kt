package com.rodrigo.movies.domain.repositories

import com.rodrigo.movies.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?

}
package com.rodrigo.movies.domain.interactors.movie

import com.rodrigo.movies.data.model.movie.Movie
import com.rodrigo.movies.domain.repositories.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {

    suspend fun execute(): List<Movie>? = movieRepository.getMovies()

}
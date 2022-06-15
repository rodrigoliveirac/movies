package com.rodrigo.movies.domain.interactors.tv

import com.rodrigo.movies.data.model.tvshow.TvShow
import com.rodrigo.movies.domain.repositories.TvRepository

class GetTvShowsUseCase(private val tvShowRepository: TvRepository) {

    suspend fun execute(): List<TvShow>? = tvShowRepository.getTvShows()
}
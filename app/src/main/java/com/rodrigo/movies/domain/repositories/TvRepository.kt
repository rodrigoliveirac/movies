package com.rodrigo.movies.domain.repositories

import com.rodrigo.movies.data.model.tvshow.TvShow

interface TvRepository {

    suspend fun getTvShows() : List<TvShow>?
    suspend fun updateTvShows(): List<TvShow>?

}
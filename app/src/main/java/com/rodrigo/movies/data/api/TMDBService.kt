package com.rodrigo.movies.data.api

import com.rodrigo.movies.data.model.artist.ArtistList
import com.rodrigo.movies.data.model.movie.MovieList
import com.rodrigo.movies.data.model.tvshow.TvShowsList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {

    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key") apiKey: String): Response<MovieList>

    @GET("tv/popular")
    suspend fun getPopularTvShows(@Query("api_key") apiKey: String): Response<TvShowsList>

    @GET("person/popular")
    suspend fun getPopularArtists(@Query("api_key") apiKey: String): Response<ArtistList>

}
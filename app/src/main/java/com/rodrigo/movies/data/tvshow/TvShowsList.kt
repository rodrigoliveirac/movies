package com.rodrigo.movies.data.tvshow


import com.google.gson.annotations.SerializedName

data class TvShowsList(
    @SerializedName("results")
    val tvShows: List<TvShow>?,
)
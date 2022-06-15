package com.rodrigo.movies.domain.repositories

import com.rodrigo.movies.data.model.artist.Artist

interface ArtistRepository {

    suspend fun getArtists(): List<Artist>?
    suspend fun updateArtists(): List<Artist>?

}
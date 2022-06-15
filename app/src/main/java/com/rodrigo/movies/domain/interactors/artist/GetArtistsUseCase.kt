package com.rodrigo.movies.domain.interactors.artist

import com.rodrigo.movies.data.model.artist.Artist
import com.rodrigo.movies.domain.repositories.ArtistRepository

class GetArtistsUseCase(private val artistRepository: ArtistRepository) {

    suspend fun execute(): List<Artist>? = artistRepository.getArtists()
}
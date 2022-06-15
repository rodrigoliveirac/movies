package com.rodrigo.movies.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rodrigo.movies.data.db.dao.ArtistDao
import com.rodrigo.movies.data.db.dao.MovieDao
import com.rodrigo.movies.data.db.dao.TvShowDao
import com.rodrigo.movies.data.model.artist.Artist
import com.rodrigo.movies.data.model.movie.Movie
import com.rodrigo.movies.data.model.tvshow.TvShow

@Database(
    entities = [Movie::class, TvShow::class, Artist::class],
    version = 1,
    exportSchema = false
)
abstract class TMDBDatabase : RoomDatabase() {

    abstract fun movieDao(): MovieDao
    abstract fun tvDao(): TvShowDao
    abstract fun artistDao() : ArtistDao

}
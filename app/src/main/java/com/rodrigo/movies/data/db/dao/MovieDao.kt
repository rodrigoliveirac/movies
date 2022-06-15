package com.rodrigo.movies.data.db.dao

import androidx.room.*
import com.rodrigo.movies.data.model.movie.Movie
import com.rodrigo.movies.data.model.movie.MovieList

@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMovies(movies: List<Movie>)

    @Query("DELETE FROM popular_movies")
    suspend fun deleteAllMovies()

    @Query("SELECT * FROM popular_movies")
    suspend fun getMovies(movies: List<Movie>)

}
package com.rodrigo.movies.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.rodrigo.movies.data.model.tvshow.TvShow

@Dao
interface TvShowDao {

      @Insert(onConflict = OnConflictStrategy.REPLACE)
      suspend fun saveTvShow(tvShows : List<TvShow>)

      @Query("DELETE FROM popular_tvShows")
      suspend fun deleteAllTvShows()

      @Query("SELECT * FROM popular_tvShows")
      suspend fun getTvShow(tvShows: List<TvShow>)

}
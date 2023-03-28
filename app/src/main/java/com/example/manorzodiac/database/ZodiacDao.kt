package com.example.manorzodiac.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface ZodiacDao {

//    @Query("SELECT * FROM zodiac_table WHERE id = :id")
//    suspend fun getInfo(id: Int): Zodiac?

    @Query("SELECT * FROM Zodiac")
    suspend fun getAllNames(): List<Zodiac>
}
package com.example.manorzodiac.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Zodiac")
data class Zodiac(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val description: String,
    val symbol: String,
    val month: String
)

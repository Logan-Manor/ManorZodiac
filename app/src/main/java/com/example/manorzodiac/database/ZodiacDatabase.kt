package com.example.manorzodiac.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Zodiac::class], version = 1)
abstract class ZodiacDatabase : RoomDatabase() {
    abstract fun zodiacDao(): ZodiacDao

    companion object{
        private var INSTANCE: ZodiacDatabase? = null
        fun getDatabase(context: Context): ZodiacDatabase{
            if(INSTANCE == null) {
                synchronized(this) {
                    INSTANCE =
                        Room.databaseBuilder(context,
                            ZodiacDatabase::class.java, "Zodiac")
                            .createFromAsset("zodiac.db").build()
                }
            }
            return INSTANCE!!
        }
    }
}
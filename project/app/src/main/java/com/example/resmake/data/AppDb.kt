package com.example.resmake.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Form::class], version = 1)
abstract class AppDb : RoomDatabase() {

    abstract fun formDao(): FormDao

    companion object {
        @Volatile
        private var INSTANCE: AppDb? = null

        // Cyril: this is called a singleton design pattern.
        fun getDatabase(context: Context): AppDb {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDb::class.java,
                    "resmake_database"
                ).allowMainThreadQueries().build()
                INSTANCE = instance
                instance
            }
        }
    }
}

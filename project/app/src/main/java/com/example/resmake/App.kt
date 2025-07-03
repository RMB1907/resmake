package com.example.resmake

import android.app.Application
import com.example.resmake.data.AppDb

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        db = AppDb.getDatabase(applicationContext)
    }

    companion object {
        private var db: AppDb? = null // error without private
        fun getDb(): AppDb? = db// single line function
    }
}
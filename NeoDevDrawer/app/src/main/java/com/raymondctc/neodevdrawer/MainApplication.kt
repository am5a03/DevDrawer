package com.raymondctc.neodevdrawer

import android.app.Application
import com.raymondctc.neodevdrawer.db.AppDatabase

class MainApplication: Application() {

    companion object {
        var db: AppDatabase? = null
    }

    override fun onCreate() {
        super.onCreate()
    }
}
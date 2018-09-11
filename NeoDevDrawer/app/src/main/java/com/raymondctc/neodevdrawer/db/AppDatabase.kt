package com.raymondctc.neodevdrawer.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.raymondctc.neodevdrawer.db.dao.AppDao
import com.raymondctc.neodevdrawer.db.dao.FilterDao
import com.raymondctc.neodevdrawer.db.dao.LocaleDao
import com.raymondctc.neodevdrawer.db.entity.App
import com.raymondctc.neodevdrawer.db.entity.Filter
import com.raymondctc.neodevdrawer.db.entity.Locale

@Database(
        entities = [
            Filter::class,
            App::class, Locale::class
        ],
        version = 1
)
abstract class AppDatabase: RoomDatabase() {
    companion object {
        const val DB = "neodevdrawer"

        private var INSTANCE: AppDatabase? = null

        fun getIntance(context: Context): AppDatabase? {
            if (INSTANCE == null) {
                synchronized(AppDatabase::class) {
                    INSTANCE = Room.databaseBuilder(context, AppDatabase::class.java, AppDatabase.DB)
                            .build()
                }
            }
            return INSTANCE
        }

        fun destroy() {
            INSTANCE = null
        }
    }
    abstract fun filterDao(): FilterDao
    abstract fun appDao(): AppDao
    abstract fun localeDao(): LocaleDao
}
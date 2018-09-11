package com.raymondctc.neodevdrawer.db

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface LocaleDao {
    @Query("SELECT * FROM locale")
    fun getAll(): List<com.raymondctc.neodevdrawer.db.entity.Locale>

    @Insert
    fun insertAll(vararg locale: com.raymondctc.neodevdrawer.db.entity.Locale)

    @Delete
    fun delete(locale: com.raymondctc.neodevdrawer.db.entity.Locale)
}
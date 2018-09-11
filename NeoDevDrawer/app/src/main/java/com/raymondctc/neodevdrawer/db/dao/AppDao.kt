package com.raymondctc.neodevdrawer.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.raymondctc.neodevdrawer.db.entity.App

@Dao
interface AppDao {

    @Query("SELECT * FROM app")
    fun getAll(): List<App>

    @Insert
    fun insertAll(vararg app: App)

    @Delete
    fun delete(app: App)
}
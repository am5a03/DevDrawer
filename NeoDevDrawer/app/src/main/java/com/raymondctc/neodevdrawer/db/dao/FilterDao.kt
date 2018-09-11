package com.raymondctc.neodevdrawer.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface FilterDao {

    @Query("SELECT * FROM filter")
    fun getAll(): List<com.raymondctc.neodevdrawer.db.entity.Filter>

    @Insert
    fun insertAll(vararg filter: com.raymondctc.neodevdrawer.db.entity.Filter)

    @Delete
    fun delete(filter: com.raymondctc.neodevdrawer.db.entity.Filter)
}
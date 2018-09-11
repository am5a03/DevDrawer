package com.raymondctc.neodevdrawer.db.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Filter(
        @PrimaryKey val id: Long,
        val packageName: String
)
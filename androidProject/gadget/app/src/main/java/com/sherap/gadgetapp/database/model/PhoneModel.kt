package com.sherap.gadgetapp.model.custom

import androidx.room.Database
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.RoomDatabase

@Entity
data class PhoneModel(
    @PrimaryKey val id: Int,
    val title: String,
    val imageUrl: String,
)

// Create a Room Database
@Database(entities = [PhoneModel::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun phoneDao(): UserDao
}

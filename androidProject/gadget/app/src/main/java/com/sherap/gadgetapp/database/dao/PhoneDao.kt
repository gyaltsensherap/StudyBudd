package com.sherap.gadgetapp.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.sherap.gadgetapp.database.model.PhoneModel

@Dao
interface PhoneDao {
    @Insert
    suspend fun insert(phones: List<PhoneModel>)

    @Query("SELECT * FROM PhoneModel")
    suspend fun getAllPhones(): List<PhoneModel>
}

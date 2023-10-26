package com.sherap.ibot.di

import androidx.room.Dao
import androidx.room.Query

@Dao
interface TodoDao {
    @Query("SELECT * FROM Todo")
    fun getAll():

    @Query("SELECT * FROM Todo WHERE uid IN (:Tti)")
    fun loadAllByIds(userIds: IntArray): List<User>

    @Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
           "last_name LIKE :last LIMIT 1")
    fun findByName(first: String, last: String): User

    @Insert
    fun insertAll(vararg users: User)

    @Delete
    fun delete(user: User)
}
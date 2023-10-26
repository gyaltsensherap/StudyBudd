package com.sherap.myapplication.database.todo

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {
    @Query("SELECT * FROM todo")
    fun getAll(): List<Todo>

    @Query("SELECT * FROM todo WHERE tid  =:tId")
    fun getTodoById(tId: Int): Todo

    @Insert
    fun insert(todo: Todo)

    @Delete
    fun delete(todo: Todo)
}

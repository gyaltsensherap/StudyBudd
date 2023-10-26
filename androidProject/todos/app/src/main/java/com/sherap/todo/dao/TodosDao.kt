package com.sherap.todo.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.sherap.todo.model.Todos

@Dao
interface TodosDao {
    @Query("SELECT * FROM todoTable")
    fun getAll(): List<TodosTable>

    @Query("SELECT * FROM todoTable WHERE tid =:tid")
    fun getTodosById(tid: Int): List<TodosTable>

    @Insert
    fun insertAll(todos: Todos)

    @Delete
    fun delete(todos: Todos)
}

package com.sherap.notesproject.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import com.sherap.notesproject.model.Notes
import androidx.room.Insert as Insert

@Dao
interface NotesDao {
    @Query("SELECT * FROM notes_project_table")
    fun getAll(): List<Notes>

    @Query("SELECT * FROM notes_project_table WHERE uid IN (:notesIds)")
    fun getNotesById(notesIds: IntArray): List<Notes>

    @Insert
    fun insertAll(notes: Notes)

    @Delete
    fun delete(notes: Notes)
}

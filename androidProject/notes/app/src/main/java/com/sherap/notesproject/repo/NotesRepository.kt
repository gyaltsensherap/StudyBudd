package com.sherap.notesproject

import androidx.lifecycle.LiveData
import com.sherap.notesproject.dao.NotesDao
import com.sherap.notesproject.model.Notes

class NotesRepository(private val notesDao: NotesDao) {
    val notesRepo: LiveData<List<Notes>> = notesDao.getAll()

    suspend fun insert(notes: Notes) {
        notesDao.insertAll(notes)
    }
}

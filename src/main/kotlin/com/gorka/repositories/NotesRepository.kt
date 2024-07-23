package com.gorka.repositories

import com.gorka.models.Note
import com.gorka.models.Note.*
import com.gorka.models.Note.Type.*

object NotesRepository {
    fun getAll(): List<Note> {
        val notes = (1..10).map {
            Note(
                "Title $it",
                "Description $it",
                if (it % 3 == 0) AUDIO else TEXT
            )
        }
        return notes
    }
}
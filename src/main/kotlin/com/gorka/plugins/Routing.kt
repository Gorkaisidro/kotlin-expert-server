package com.gorka.plugins

import com.gorka.repositories.NotesRepository
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        route("/notes") {

            // CREATE

            // READ

            get {
                call.respond(NotesRepository.getAll())
            }

            // UPDATE

            // DELETE
        }
    }
}

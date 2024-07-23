package com.gorka

import com.gorka.plugins.configureRouting
import com.gorka.plugins.configureSerialization
import com.gorka.plugins.*
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureRouting()
    configureSerialization()
}



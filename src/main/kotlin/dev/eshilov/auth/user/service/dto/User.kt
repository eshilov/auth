package dev.eshilov.auth.user.service.dto

import java.util.*

data class User(
    val id: UUID,
    val firstName: String,
    val lastName: String
)

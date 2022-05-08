package dev.eshilov.auth.user.service.dto

data class UserCreateRequest(
    val email: String,
    val firstName: String,
    val lastName: String,
    val passwordHash: String
)

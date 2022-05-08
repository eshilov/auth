package dev.eshilov.auth.user.service

import dev.eshilov.auth.user.service.dto.User
import dev.eshilov.auth.user.service.dto.UserCreateRequest

interface UserService {

    fun createUser(request: UserCreateRequest): User
}
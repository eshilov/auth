package dev.eshilov.auth.user.service

import dev.eshilov.auth.user.data.UserRepository
import dev.eshilov.auth.user.mapper.UserMapper
import dev.eshilov.auth.user.service.dto.User
import dev.eshilov.auth.user.service.dto.UserCreateRequest
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    private val userMapper: UserMapper,
    private val userRepository: UserRepository
) : UserService {

    override fun createUser(request: UserCreateRequest): User {
        val entityToCreate = userMapper.toEntity(request)
        val createdEntity = userRepository.save(entityToCreate)
        return userMapper.toDto(createdEntity)
    }
}
package dev.eshilov.auth.user.mapper

import dev.eshilov.auth.user.data.UserEntity
import dev.eshilov.auth.user.service.dto.User
import dev.eshilov.auth.user.service.dto.UserCreateRequest
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy.IGNORE

@Mapper(componentModel = "spring", unmappedTargetPolicy = IGNORE)
interface UserMapper {

    fun toDto(entity: UserEntity): User
    fun toEntity(request: UserCreateRequest): UserEntity
}
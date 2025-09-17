package io.nasa.userManagement.mapper;

import io.nasa.userManagement.entity.UserEntity;
import io.nasa.userManagement.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserEntity toEntity(User user);
    User toDto(UserEntity userEntity);
}

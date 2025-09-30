package io.nasa.userManagement.mapper;

import io.nasa.userManagement.entity.UserEntity;
import io.nasa.userManagement.model.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserEntity toEntity(User user);
    User toDto(UserEntity userEntity);
    List<User>toDtoList(List<UserEntity> userEntityList);
    List<UserEntity> toEntityList(List<User> userList);
}

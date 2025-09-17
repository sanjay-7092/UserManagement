package io.nasa.userManagement.service;

import io.nasa.userManagement.entity.UserEntity;
import io.nasa.userManagement.mapper.UserMapper;
import io.nasa.userManagement.model.User;
import io.nasa.userManagement.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository,UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper=userMapper;
    }


    public User create(User user){
        UserEntity userEntity = userMapper.toEntity(user);
        if(userRepository.findByEmail(userEntity.getEmail())!=null){
            return null;
        }
        return userMapper.toDto(userRepository.save(userEntity));
    }

    public User getUser(Long userId){
        return null;
    }

    public User updateUser(User user){
        return user;
    }
}

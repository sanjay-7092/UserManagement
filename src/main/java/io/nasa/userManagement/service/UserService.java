package io.nasa.userManagement.service;

import io.nasa.userManagement.entity.UserEntity;
import io.nasa.userManagement.mapper.UserMapper;
import io.nasa.userManagement.model.User;
import io.nasa.userManagement.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public List<User> getAllUser(){
        return userMapper.toDtoList(userRepository.findAll());
    }
    public User getUser(Long userId){
        Optional<UserEntity> userEntity =  userRepository.findById(userId);
        if(userEntity.isPresent()){
            return userMapper.toDto(userEntity.get());
        }else{
            throw new RuntimeException("The user not found with the id " + userId);
        }
    }

    public User updateUser(User user){
            return userMapper.toDto(userRepository.save(userMapper.toEntity(user)));
    }
    public void deleteUserById(Long userId){
        Optional<UserEntity> userEntity = userRepository.findById(userId);
        if(userEntity.isPresent()){
            userRepository.deleteById(userId);
        }
    }
}

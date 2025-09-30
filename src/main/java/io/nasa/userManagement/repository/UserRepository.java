package io.nasa.userManagement.repository;

import io.nasa.userManagement.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {

    UserEntity findByEmail(String email);
//    UserEntity findById(Long userId);
}

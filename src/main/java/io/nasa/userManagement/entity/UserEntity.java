package io.nasa.userManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="users")
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String passWord;
}

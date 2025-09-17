package io.nasa.userManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class User {

    private Long id;
    private String userName;
    private String firstName;
    private String email;
    private String lastName;
    private String passWord;
}

package io.nasa.userManagement.model;


import lombok.Getter;
import lombok.Setter;


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

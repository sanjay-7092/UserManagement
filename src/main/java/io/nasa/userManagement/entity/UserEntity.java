package io.nasa.userManagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="username")
    private String userName;
    @Column(name ="firstname")
    private String firstName;
    @Column(name ="lastname")
    private String lastName;
    @Column(name ="email")
    private String email;
    @Column(name ="password")
    private String passWord;
}

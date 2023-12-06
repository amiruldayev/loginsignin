package com.example.login;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name", length = 200)
    private String name;
    @Column(name = "surname", length = 200)
    private String surname;
    @Column(name = "login", length = 200)
    private String login;
    @Column(name = "password", length = 200)
    private String password;
}

package com.example.crudprtc3.Entity;

import com.example.crudprtc3.Entity.enums.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
@Table
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Role role;

    @OneToOne
    User user;

    @Builder
    public Account(String email, String password, Role role, User user){
        this.email = email;
        this.password = password;
        this.role = role;
        this.user = user;
    }
}

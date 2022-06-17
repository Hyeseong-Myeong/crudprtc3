package com.example.crudprtc3.Dto;

import com.example.crudprtc3.Entity.Account;
import com.example.crudprtc3.Entity.User;
import com.example.crudprtc3.Entity.enums.Role;
import lombok.Data;

@Data
public class AccountCreateDto {

    private String email;
    private String password;
    private Role role;
    private User user;

    public Account toEntity(){
        return Account.builder().email(email).password(password).role(role).user(user).build();
    }
}

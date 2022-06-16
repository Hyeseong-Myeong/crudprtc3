package com.example.crudprtc3.Dto;

import com.example.crudprtc3.Entity.User;
import lombok.Data;

@Data
public class UserDto {
    private String name;

    public User toEntity(){
        return User.builder().name(name).build();
    }
}

package com.example.crudprtc3.Dto;

import com.example.crudprtc3.Entity.Post;
import com.example.crudprtc3.Entity.User;
import com.example.crudprtc3.Entity.enums.BoardType;
import lombok.Data;

@Data
public class PostDto {
    private String title;
    private String content;

    private BoardType boardType;
    private User user;

    public Post toEntity(){
        return Post.builder().title(title).content(content).boardType(boardType).user(user).build();
    }
}

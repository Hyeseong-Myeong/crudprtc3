package com.example.crudprtc3.Dto;

import com.example.crudprtc3.Entity.Post;
import com.example.crudprtc3.Entity.User;
import lombok.Data;

@Data
public class PostDto {
    private String title;
    private String content;

    public Post toEntity(){
        return Post.builder().title(title).content(content).build();
    }
}

package com.example.crudprtc3.Dto;

import com.example.crudprtc3.Entity.Comment;
import com.example.crudprtc3.Entity.Post;
import com.example.crudprtc3.Entity.User;
import lombok.Data;

@Data
public class CommentDto {
    private String comment;
    private User user;
    private Post post;

    public Comment toEntity(){
        return Comment.builder().comment(comment).user(user).post(post).build();
    }
}

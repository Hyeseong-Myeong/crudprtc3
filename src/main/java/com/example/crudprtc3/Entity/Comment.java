package com.example.crudprtc3.Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Comment extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "Text")
    private String comment;

    @ManyToOne
    User user;

    @ManyToOne
    Post post;

    @Builder
    public Comment(String comment, User user, Post post){
        this.comment = comment;
        this.user = user;
        this.post = post;
    }

}

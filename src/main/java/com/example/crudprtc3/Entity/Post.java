package com.example.crudprtc3.Entity;

import com.example.crudprtc3.Entity.enums.BoardType;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
@Table
public class Post extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "Text")
    private String content;

    @ManyToOne
    User user;

    @Column(nullable = false)
    private BoardType boardType;

    @Builder
    public Post(String title, String content, User user, BoardType boardType){
        this.title = title;
        this.content = content;
        this.user = user;
        this.boardType = boardType;
    }
}

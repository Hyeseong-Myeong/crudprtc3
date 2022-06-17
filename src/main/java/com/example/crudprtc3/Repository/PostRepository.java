package com.example.crudprtc3.Repository;

import com.example.crudprtc3.Entity.Post;
import com.example.crudprtc3.Entity.enums.BoardType;
import com.example.crudprtc3.Entity.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByBoardType(BoardType boardType);
}

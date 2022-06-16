package com.example.crudprtc3.Controller;

import com.example.crudprtc3.Dto.CommentDto;
import com.example.crudprtc3.Dto.PostDto;
import com.example.crudprtc3.Dto.UserDto;
import com.example.crudprtc3.Entity.Post;
import com.example.crudprtc3.Entity.User;
import com.example.crudprtc3.Service.BoardService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class BoardController {

    private final BoardService boardService;

//User Method
    @PostMapping("/user")
    public ResponseEntity CreateUser(@RequestBody UserDto dto){
        return ResponseEntity.ok(boardService.CreateUser(dto));
    }

    @GetMapping("/user")
    public ResponseEntity ReadUser(){
        return ResponseEntity.ok(boardService.ReadUser());
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> ReadUserById(@PathVariable Long id){
        return ResponseEntity.ok(boardService.ReadUserById(id));
    }

//    @PutMapping("/user/{id}")
//    public void UpdateUser(@PathVariable Long id, @RequestBody UserDto dto){
//        boardService.UpdateUser(id, dto);
//        return;
//    }

    @DeleteMapping("/user/{id}")
    public void DeleteUserById(@PathVariable Long id){
        boardService.DeleteUser(id);
        return;
    }

//Post Method
    @PostMapping("/post")
    public ResponseEntity CreatePost(@RequestBody PostDto dto){
        return ResponseEntity.ok(boardService.CreatePost(dto));
    }

    @GetMapping("/post")
    public ResponseEntity ReadPostList(){
        return ResponseEntity.ok(boardService.ReadPost());
    }

    @GetMapping("/post/{id}")
    public ResponseEntity<Post> ReadPostById(@PathVariable Long id){
        return ResponseEntity.ok(boardService.ReadPostById(id));
    }

//    @PutMapping("/post/{id}")
//    public void UpdatePost(@PathVariable Long id, PostDto dto){
//        boardService.UpdatePost(id, dto);
//        return;
//    }

    @DeleteMapping("/post/{id}")
    public void DeletePost(@PathVariable Long id){
        boardService.DeletePost(id);
        return;
    }

//Comment Method
    @PostMapping("/comment")
    public ResponseEntity PostComment(@RequestBody CommentDto dto){
        return ResponseEntity.ok(boardService.CreateComment(dto));
    }

    @GetMapping("/comment/{id}")
    public ResponseEntity ReadCommentByPostId(@PathVariable Long PostId){
        return ResponseEntity.ok(boardService.ReadCommentById(PostId));
    }

//    @PutMapping("/comment/{id}")
//    public void UpdateComment(@PathVariable Long id, @RequestBody CommentDto dto){
//        boardService.UpdateComment(id, dto);
//        return;
//    }

    @DeleteMapping("/comment/{id}")
    public void DeleteComment(@PathVariable Long id){
        boardService.DeleteComment(id);
        return;
    }

}

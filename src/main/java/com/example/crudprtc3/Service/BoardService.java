package com.example.crudprtc3.Service;

import com.example.crudprtc3.Dto.CommentDto;
import com.example.crudprtc3.Dto.PostDto;
import com.example.crudprtc3.Dto.UserDto;
import com.example.crudprtc3.Entity.Comment;
import com.example.crudprtc3.Entity.Post;
import com.example.crudprtc3.Entity.User;
import com.example.crudprtc3.Repository.CommentRepository;
import com.example.crudprtc3.Repository.PostRepository;
import com.example.crudprtc3.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityExistsException;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
@AllArgsConstructor
public class BoardService {

    private UserRepository userRepository;
    private PostRepository postRepository;
    private CommentRepository commentRepository;

    private final static Logger Log = Logger.getGlobal();

//User 관련 Service
    //user Create
    @Transactional
    public Long CreateUser(UserDto dto) {
        return userRepository.save(dto.toEntity()).getId();
    }

    //user Read
    @Transactional(readOnly = true)
    public User ReadUserById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (!optionalUser.isPresent()) {
            Log.warning("User is not present");
            throw new EntityExistsException("[Exception]User is not present");
        }
        return optionalUser.get();
    }

    //user List read
    @Transactional(readOnly = true)
    public List<User> ReadUser() {
        return userRepository.findAll();
    }

    //user update
//    @Transactional
//    public Long UpdateUser(Long userId, UserDto dto){
//        Optional<User> optionalUser = userRepository.findById(userId);
//
//        if(!optionalUser.isPresent()){
//            Log.warning("User is not Present");
//            throw new EntityExistsException("[Exception] user is not Present in DB");
//        }
//        dto.setUserId(userId);
//        return userRepository.save(dto.toEntity()).getId();
//    }

    //user Delete
    @Transactional
    public void DeleteUser(Long id){
        userRepository.deleteById(id);
        return;
    }


//Post 관련 Service
    //Post Create
    @Transactional
    public Long CreatePost(PostDto dto){
        return postRepository.save(dto.toEntity()).getId();
    }

    //PostReadById
    @Transactional(readOnly = true)
    public Post ReadPostById(Long id){
        Optional<Post> optionalPost = postRepository.findById(id);

        if(!optionalPost.isPresent()){
            Log.warning("Post is not present");
            throw new EntityExistsException("[Exception] Post is not present in DB");
        }
        return optionalPost.get();
    }

    //PostListRead
    @Transactional(readOnly = true)
    public List<Post> ReadPost(){
        return postRepository.findAll();
    }

    //PostUpdate
//    @Transactional
//    public Long UpdatePost(Long id, PostDto dto){
//        Optional<Post> optionalPost = postRepository.findById(id);
//        if(!optionalPost.isPresent()){
//            Log.warning("this Post is not present");
//            throw new EntityExistsException("[Exception] Post is not present on DB");
//        }
//        dto.setPostId(id);
//        return postRepository.save(dto.toEntity()).getId();
//    }

    //Post Delete
    @Transactional
    public void DeletePost(Long id){
        postRepository.deleteById(id);
        return;
    }

//Comment 관련 Service
    //comment Create
@Transactional
    public Long CreateComment(CommentDto dto){
        return commentRepository.save(dto.toEntity()).getId();
    }

    //comment Read with Post id
    @Transactional(readOnly = true)
    public List<Comment> ReadCommentById(Long PostId){
        return commentRepository.findByPostId(PostId);
    }

    //Comment Update
//    @Transactional
//    public Long UpdateComment(Long id, CommentDto dto){
//        Optional<Comment> optionalComment = commentRepository.findById(id);
//        if(!optionalComment.isPresent()){
//            Log.warning("Comment is not Present");
//            throw new EntityExistsException("[Exception] Comment is not Present on DB");
//        }
//        dto.setCommentId(id);
//        return commentRepository.save(dto.toEntity()).getId();
//    }

    //Comment delete
    @Transactional
    public void DeleteComment(Long id){
        commentRepository.deleteById(id);
        return;
    }
}

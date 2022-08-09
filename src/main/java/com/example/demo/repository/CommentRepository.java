package com.example.demo.repository;

import com.example.demo.domain.Comment;
import com.example.demo.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByPost(Post post);
//    List<Comment> findAllByComment(Comment comment);
}

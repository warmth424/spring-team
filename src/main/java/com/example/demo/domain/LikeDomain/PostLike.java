package com.example.demo.domain.LikeDomain;

import com.example.demo.domain.Post;
import com.example.demo.domain.User;
import com.example.demo.domain.dto.likeDto.PostLikeDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PostLike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @JoinColumn(name = "member_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;


    @JoinColumn(name = "post_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Post post;


    public PostLike(PostLikeDto postLikeDto) {
        this.post = postLikeDto.getPost();
        this.user = postLikeDto.getUser();
    }

}
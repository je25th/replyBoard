package com.practice.replyBoard.board.repository;

import com.practice.replyBoard.board.post.Post;

import java.util.List;
import java.util.Optional;

public interface BoardRepository {

    public void save(Post post);
    public void modify(Post post);
    public Optional<Post> findById(Long postId);
    public List<Post> findAll();

}

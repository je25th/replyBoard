package com.practice.replyBoard.board.repository;

import com.practice.replyBoard.board.post.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class MemoryBoardRepository implements BoardRepository {

    static final Map<Long, Post> board = new ConcurrentHashMap<>();
    static long sequence = 0;

    @Override
    public void save(Post post) {
        post.setId(++sequence);
        board.put(sequence, post);
    }

    @Override
    public void modify(Post post) {

    }

    @Override
    public Optional<Post> findById(Long postId) {
        return Optional.empty();
    }

    @Override
    public List<Post> findAll() {
        return null;
    }
}

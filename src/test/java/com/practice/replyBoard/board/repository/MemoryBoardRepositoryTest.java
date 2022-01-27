package com.practice.replyBoard.board.repository;

import com.practice.replyBoard.board.post.Post;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MemoryBoardRepositoryTest {

    MemoryBoardRepository MemoryBoardRepository = new MemoryBoardRepository();

    @Test
    void write() {
        Post post = new Post("title",(long)1,"content");
        MemoryBoardRepository.save(post);
        Long postId = post.getId();

        assertThat(postId).isNotNull();
    }

    @Test
    void modify() {

    }

    @Test
    void findById() {
        //given
        Post post = new Post("title",(long)1,"content");
        MemoryBoardRepository.save(post);
        Long postId = post.getId();

        //when
        Post result = MemoryBoardRepository.findById(postId).get();

        //then
        assertThat(result).isEqualTo(post);
    }

    @Test
    void findAll() {

    }
}

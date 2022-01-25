package com.practice.replyBoard.board;

import com.practice.replyBoard.board.post.Post;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BoardTest {

    @Test
    void write() {
        BoardService boardService = new BoardService();

        Post post = new Post();
        post.setTitle("title");
        post.setWriterId((long)1);
        post.setContent("content");

        boardService.write(post);
        Long postId = post.getId();

        assertThat(postId).isNotNull();
    }
}

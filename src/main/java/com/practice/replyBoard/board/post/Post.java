package com.practice.replyBoard.board.post;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post {
    private Long id;
    private String title;
    private Long writerId;
    private String content;

    public void setWriterId(Long writerId) {
        this.writerId = writerId;
    }
}

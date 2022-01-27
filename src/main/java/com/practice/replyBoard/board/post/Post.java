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

    public Post() {
    }

    public Post(String title, Long writerId, String content) {
        this.title = title;
        this.writerId = writerId;
        this.content = content;
    }
}

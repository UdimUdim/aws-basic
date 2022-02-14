package com.awsbasic.book.springboot.web.dto;

import com.awsbasic.book.springboot.domain.*;

public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}

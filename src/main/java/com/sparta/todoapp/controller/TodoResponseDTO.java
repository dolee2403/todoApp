package com.sparta.todoapp.controller;


import com.sparta.todoapp.repository.Todo;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TodoResponseDTO {
    private Long todoId;

    private String title;

    private String content;

    private String userName;

    private LocalDateTime createAt;

    public TodoResponseDTO(Todo todo) {
        this.todoId = todo.getTodoid();
        this.title = todo.getTitle();
        this.content = todo.getContent();
        this.userName = todo.getUserName();
        this.createAt = todo.getCreatedAt();

    }


}

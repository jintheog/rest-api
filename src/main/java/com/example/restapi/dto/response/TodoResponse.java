package com.example.restapi.dto.response;

import com.example.restapi.entity.Todo;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class TodoResponse {
    private Long id;
    private String title;
    private String content;
    private boolean completed;
    private LocalDate createdAt;

    private String username;

    public static TodoResponse from(Todo todo) {
        return TodoResponse.builder()
                .id(todo.getId())
                .title(todo.getTitle())
                .content(todo.getContent())
                .completed(todo.isCompleted())
                .createdAt(todo.getCreatedAT())
                .username(todo.getUser().getUsername())
                .build();

    }
}

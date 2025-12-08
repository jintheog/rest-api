package com.example.restapi.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String content;

    private boolean completed;

    private LocalDate createdAT;

    @Builder
    public Todo(String title, String content) {
        this.title = title;
        this.content = content;
        this.completed = false;
        this.createdAT = LocalDate.now();
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}

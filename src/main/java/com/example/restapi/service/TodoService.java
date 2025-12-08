package com.example.restapi.service;

import com.example.restapi.dto.request.TodoCreateRequest;
import com.example.restapi.dto.response.TodoResponse;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TodoService {
    TodoResponse create(TodoCreateRequest todoCreateRequest);
    List<TodoResponse> findAll();
    TodoResponse findById(Long id);
    void delete(Long id);
}

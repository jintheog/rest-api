package com.example.restapi.service;

import com.example.restapi.dto.request.TodoCreateRequest;
import com.example.restapi.dto.request.TodoUpdateRequest;
import com.example.restapi.dto.response.TodoResponse;
import com.example.restapi.entity.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TodoService {
    TodoResponse create(TodoCreateRequest todoCreateRequest, String username);
    List<TodoResponse> findAll();
    TodoResponse findById(Long id);
    void delete(Long id);
    TodoResponse update(Long id, TodoUpdateRequest todoUpdateRequest);

}

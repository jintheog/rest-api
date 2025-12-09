package com.example.restapi.service;

import com.example.restapi.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public interface UserService {
    UserResponse findByUsername(String username);


}

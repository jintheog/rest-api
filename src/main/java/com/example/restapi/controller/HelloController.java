package com.example.restapi.controller;


import com.example.restapi.dto.MessageResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller => html을 찾아서 반환
@RestController // => 데이터를 반환
public class HelloController {

    @GetMapping("/api/hello")
    public String hello(){
        
        return "Hello World";
    }

    @GetMapping("/api/message") //객체 전달
    public MessageResponse message(){
        return new MessageResponse("hello", 200);
    }

    @GetMapping("/api/messages") // 객체를 담은 List를 전달
    public List<MessageResponse> messages(){
        return List.of(
                new MessageResponse("hello1", 200),
                new MessageResponse("hello2", 200),
                new MessageResponse("hello3", 200)
        );
    }
}
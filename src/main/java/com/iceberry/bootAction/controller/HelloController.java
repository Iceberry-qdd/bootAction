package com.iceberry.bootAction.controller;

import com.iceberry.bootAction.entity.User;
import com.iceberry.bootAction.mapper.HelloMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloController {
    @Autowired
    private HelloMapper mapper;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello,springboot!";
    }

    @GetMapping("/AllUsers")
    public List<User> showAllUser() {
        List<User> users = mapper.findAllUsers();
        return users;
    }
}

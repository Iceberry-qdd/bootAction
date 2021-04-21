package com.iceberry.bootAction;

import com.iceberry.bootAction.entity.User;
import com.iceberry.bootAction.mapper.HelloMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class HelloMapperTest {
    @Autowired
    private HelloMapper mapper;

    @Test
    public void findAllUsersTest(){
        List<User> users = mapper.findAllUsers();
        System.out.println(users);
    }
}

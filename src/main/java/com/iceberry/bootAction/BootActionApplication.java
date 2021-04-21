package com.iceberry.bootAction;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.iceberry.bootAction.mapper")
public class BootActionApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootActionApplication.class, args);
    }

}

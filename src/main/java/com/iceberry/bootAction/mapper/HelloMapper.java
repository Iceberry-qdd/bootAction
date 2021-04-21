package com.iceberry.bootAction.mapper;

import com.iceberry.bootAction.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HelloMapper {

    @Select("SELECT id,name,age,sex FROM User")
    List<User> findAllUsers();

    User findUserByName(String name);
}

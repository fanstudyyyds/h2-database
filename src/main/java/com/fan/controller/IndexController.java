package com.fan.controller;

import com.fan.entity.User;
import com.fan.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/")
    public List<User> testSelect() {
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
        return userList;
    }

    @RequestMapping("/add")
    public List<User> add() {
        User user = new User(6L, "lll", 10, "1111111");
        userMapper.insert(user);
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
        return userList;
    }
}

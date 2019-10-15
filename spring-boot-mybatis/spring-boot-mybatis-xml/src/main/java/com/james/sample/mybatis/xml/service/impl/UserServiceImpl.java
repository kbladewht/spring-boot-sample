package com.james.sample.mybatis.xml.service.impl;

import com.james.sample.mybatis.xml.entity.User;
import com.james.sample.mybatis.xml.mapper.UserMapper;
import com.james.sample.mybatis.xml.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}

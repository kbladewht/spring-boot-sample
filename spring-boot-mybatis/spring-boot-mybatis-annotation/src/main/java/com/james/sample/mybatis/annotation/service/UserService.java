package com.james.sample.mybatis.annotation.service;

import com.james.sample.mybatis.annotation.entity.User;

import java.util.List;

public interface UserService {

    void insertUser(User user);

    List<User> getAllUser();
}

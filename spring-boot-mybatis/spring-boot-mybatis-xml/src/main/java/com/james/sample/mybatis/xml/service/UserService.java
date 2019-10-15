package com.james.sample.mybatis.xml.service;

import com.james.sample.mybatis.xml.entity.User;

import java.util.List;

public interface UserService {

    void insertUser(User user);

    List<User> getAllUser();
}

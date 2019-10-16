package com.james.sample.mybatis.xml.mapper;

import com.james.sample.mybatis.xml.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    void insert(User user);

    void update(User user);

    User getUserByUsername(String username);

    User getUserByUserId(int userId);

    List<User> getAllUser();

    /**
     * 根据 id 删除用户信息
     */
    void deleteUser(int userId);

}

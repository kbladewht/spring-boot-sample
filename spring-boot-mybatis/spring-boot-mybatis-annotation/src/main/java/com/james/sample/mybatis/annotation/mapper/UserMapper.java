package com.james.sample.mybatis.annotation.mapper;

import com.james.sample.mybatis.annotation.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Insert("INSERT INTO user(username, password, email, avatar, sex, activated, create_time, update_time) " +
            "VALUES(#{username}, #{password}, #{email}, #{avatar}, #{sex}, #{activated}, #{createTime}, #{updateTime})")
    void insert(User user);

    @Update("UPDATE  user SET username = #{username},password = #{password},email= #{email},avatar= #{avatar}," +
            "sex= #{sex},activated= #{activated},create_time= #{create_time},update_time= #{update_time} " +
            "WHERE user_id = #{user_id}")
    void update(User user);

    @Select("SELECT * FROM user WHERE username = #{username}")
    @ResultMap("com.james.sample.mybatis.annotation.mapper.UserMapper.userResultMap")
    User getUserByUsername(String username);

    @Select("SELECT * FROM user WHERE user_id = #{userId}")
    @ResultMap("com.james.sample.mybatis.annotation.mapper.UserMapper.userResultMap")
    User getUserByUserId(int userId);

    @Select("SELECT * FROM user")
    List<User> getAllUser();

    /**
     * 根据 id 删除用户信息
     */
    @Delete("DELETE from user WHERE user_id = #{userId}")
    void deleteUser(int userId);

}

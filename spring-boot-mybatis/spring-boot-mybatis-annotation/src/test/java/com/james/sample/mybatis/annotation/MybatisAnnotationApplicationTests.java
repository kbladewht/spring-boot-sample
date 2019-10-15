package com.james.sample.mybatis.annotation;

import com.james.sample.mybatis.annotation.entity.User;
import com.james.sample.mybatis.annotation.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisAnnotationApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void userServiceInsertUserTest() {

//        User user = new User();
//        user.setUsername("james");
//        user.setPassword("jamesjames");
//        user.setEmail("james@gmail.com");
//        user.setAvatar("avatar");
//        user.setSex((byte) 0);
//        user.setActivated((byte) 0);
//        user.setCreateTime(System.currentTimeMillis());
//        user.setUpdateTime(System.currentTimeMillis());
//
//        userService.insertUser(user);

        List<User> users = userService.getAllUser();

        System.out.println(users.toString());
    }
}

package com.james.sample.mybatis.xml;

import com.james.sample.mybatis.xml.entity.User;
import com.james.sample.mybatis.xml.mapper.UserMapper;
import com.james.sample.mybatis.xml.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybatisXmlApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void userMapperTest() {

//        User user = new User();
//        user.setUsername("Kylin");
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

        System.out.println("=================================");
        System.out.println("用户数 ：" + users.size());
        for (User user1 : users) {
            System.out.println(user1.toString());
        }

    }

}

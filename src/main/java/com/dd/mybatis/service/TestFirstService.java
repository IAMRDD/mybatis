package com.dd.mybatis.service;

import com.dd.mybatis.mapper.TestFirstMapper;
import com.dd.mybatis.vo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestFirstService {
    @Autowired
    private TestFirstMapper testFirstMapper;

    @Test
    public void getAll() {
        List<User> users = testFirstMapper.getAll();

        System.out.println(users.toString());
    }

    @Test
    public void insert(){
        User user = new User();
        user.setAddr("南京");
        user.setAge((byte)23);
        user.setCard("1234");
        user.setUsername("锜姐");
        user.setEmail("@gmail2");
        user.setTel("17876253559");
        user.setSalary(1.2f);
        user.setSex("woman");
        user.setMarried((byte)0);
        user.setPassword("123");

        int result = testFirstMapper.insert(user);

        System.out.println("result:"+user);
    }



}

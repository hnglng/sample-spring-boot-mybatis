package com.hnglng.sample.spring.boot.mybatis.domain.service;

import com.hnglng.sample.spring.boot.mybatis.domain.model.User;
import com.hnglng.sample.spring.boot.mybatis.domain.model.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by huang_liang on 2017/2/24.
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User findUserby(String name){
        return userMapper.findByName(name);
    }
}

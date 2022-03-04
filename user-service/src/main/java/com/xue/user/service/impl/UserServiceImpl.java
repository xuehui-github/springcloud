package com.xue.user.service.impl;

import com.xue.user.mapper.UserMapper;
import com.xue.user.pojo.User;
import com.xue.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryById(Long id) {
        User user = userMapper.findById(id);
        return user;
    }
}

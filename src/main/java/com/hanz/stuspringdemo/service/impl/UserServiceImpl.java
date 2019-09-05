package com.hanz.stuspringdemo.service.impl;

import com.hanz.stuspringdemo.dao.UserMapper;
import com.hanz.stuspringdemo.domain.User;
import com.hanz.stuspringdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper dao;

    public boolean addUser(User user) {
        return dao.addUser(user);
    }

    public boolean updUser(User user) {
        return dao.updUser(user);
    }

    public boolean delUserById(int id) {
        return dao.delUserById(id);
    }

    public User getUserById(int id) {
        return dao.getUserById(id);
    }

}

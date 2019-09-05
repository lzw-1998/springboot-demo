package com.hanz.stuspringdemo.service;

import com.hanz.stuspringdemo.domain.User;

public interface UserService {


        boolean addUser(User dept);

        boolean updUser(User dept);

        boolean delUserById(int id);

        User getUserById(int id);

        User selectByName(String name);
}

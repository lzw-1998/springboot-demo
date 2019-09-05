package com.hanz.stuspringdemo.dao;

import com.hanz.stuspringdemo.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    boolean addUser(User user);

    boolean updUser(User user);

    boolean delUserById(int id);

    User getUserById(int id);
}

package com.aiassistant.aiassistant.service;

import com.aiassistant.aiassistant.dao.UserDao;
import com.aiassistant.aiassistant.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(User user) {
        userDao.save(user);
    }

    public boolean validate(User user) {
        return userDao.findById(user.getUsername()).isPresent();
    }
}

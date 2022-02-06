package com.followup.backend.service;

import java.util.List;

import com.followup.backend.dao.UserDao;
import com.followup.backend.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(readOnly = true)
    public List<User> findByMail(User user){
        return userDao.findByMail(user.getMail());
    } 

    @Override
    @Transactional
    public void saveUser(User user){
        userDao.save(user);
    }
}

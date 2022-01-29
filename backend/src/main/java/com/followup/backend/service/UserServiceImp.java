package com.followup.backend.service;

import com.followup.backend.dao.UserDao;
import com.followup.backend.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private JdbcTemplate jdbc;

    @Override
    @Transactional(readOnly = true)
    public String searchUser(User user){
        try{
            jdbc.execute("SELECT * FROM users");
            System.out.println("arreglado");
        }catch(Exception e){
            System.out.println(e);
        } 
        return "";
    }

    @Override
    @Transactional
    public void saveUser(User user){
        userDao.save(user);
    }
}

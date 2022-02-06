package com.followup.backend.dao;

import java.util.List;

import com.followup.backend.domain.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User,Long>{
    List<User> findByMail(String mail);
    
}

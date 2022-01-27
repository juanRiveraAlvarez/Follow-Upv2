package com.followup.backend.dao;

import com.followup.backend.domain.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User,Long>{
    
}

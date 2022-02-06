package com.followup.backend.service;

import com.followup.backend.domain.User;

import java.util.*;

public interface UserService {
    public List<User> findByMail(User user);
    public void saveUser(User user);
}

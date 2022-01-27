package com.followup.backend.service;

import com.followup.backend.domain.User;

public interface UserService {
    public User searchUser(User user);
    public void saveUser(User user);
}

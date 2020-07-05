package com.tianshu.service;

import com.tianshu.entity.User;

public interface LoginService {
    public User login(String username, String password);
}

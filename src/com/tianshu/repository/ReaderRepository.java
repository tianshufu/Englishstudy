package com.tianshu.repository;

import com.tianshu.entity.User;

import java.io.Reader;

public interface ReaderRepository {
    public User login(String username, String password);
}

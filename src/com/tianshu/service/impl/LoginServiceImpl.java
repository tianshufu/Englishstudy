package com.tianshu.service.impl;

import com.tianshu.repository.ReaderRepository;
import com.tianshu.repository.impl.ReaderRepositoryImpl;
import com.tianshu.service.LoginService;
import com.tianshu.entity.User;

public class LoginServiceImpl implements LoginService {
    private ReaderRepository readerRepository=new ReaderRepositoryImpl();
    @Override
    public User login(String username, String password) {
        return readerRepository.login(username,password);
    }
}

package com.test.api.service;


import com.test.api.mapper.UserMapper;
import com.test.api.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {


    @Autowired
    UserMapper userMapper;

    public List<Admin> get(){
        return userMapper.getAll();
    }

}

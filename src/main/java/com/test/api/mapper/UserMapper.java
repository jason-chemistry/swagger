package com.test.api.mapper;


import com.test.api.model.Admin;
import com.test.api.model.User;

import java.util.List;

public interface UserMapper {

    List<User> getAll(String pid);


    List<String> test();

}

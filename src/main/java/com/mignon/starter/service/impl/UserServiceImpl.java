package com.mignon.starter.service.impl;


import com.mignon.starter.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author WWenHai
 * @desc:
 * @date: 2025-07-15 21:21
 **/
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void sayHello() {
        System.out.println("hello lo");
    }
}

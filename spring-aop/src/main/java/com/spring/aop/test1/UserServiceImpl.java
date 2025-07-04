package com.spring.aop.test1;

import org.springframework.stereotype.Component;


/**
 * @desc: todo
 * @author: yaowei
 * @since:2025/7/4
 */

@Component("userService")
public class UserServiceImpl {


    public void say() {
        System.out.println("say");
    }
}

package com.lpf.demo.userserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: user-server
 * @description: 用户Controller
 * @author: @KeNan
 * @create: 2019-06-10 15:47
 **/
@RestController
@RefreshScope
public class UserController {
   @Value("${hello.text}")
    String text;
    @GetMapping("/login")
    public String login(){
        System.out.println(text +"2222222");

       return text;
    }

}

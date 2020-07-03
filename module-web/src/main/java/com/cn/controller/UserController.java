package com.cn.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cn.service.UserServcie;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: 应飞虎
 * @Date: 2020/7/3 10:48
 * @Desc:
 */
@RestController
public class UserController {

    @Resource
    private UserServcie userServcie;

    @GetMapping("/hello")
    private String hello() {
        return userServcie.hello();
    }
}

package com.cn.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cn.service.UserServcie;


/**
 * @Author: 应飞虎
 * @Date: 2020/7/3 10:48
 * @Desc:
 */
@Service
public class UserServcieImpl implements UserServcie {
    @Override
    public String hello() {
        return "hello";
    }
}

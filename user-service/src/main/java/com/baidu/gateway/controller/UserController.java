package com.baidu.gateway.controller;

import com.baidu.gateway.pojo.User;
import com.baidu.gateway.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: XieZhiGui
 * @Date: 2019-9-23
 * @Description: com.baidu.gateway.controller
 * @version: 1.0
 */
@RestController()
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/{id}")
    public User getById(@PathVariable Integer id){

        return userService.getById(id);
    }
}

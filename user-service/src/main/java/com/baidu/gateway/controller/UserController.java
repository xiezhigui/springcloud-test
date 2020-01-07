package com.baidu.gateway.controller;

import com.baidu.gateway.pojo.User;
import com.baidu.gateway.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static final Logger logger= LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @RequestMapping("/user/{id}")
    public User getById(@PathVariable Integer id){
        logger.info(id.toString());
        return userService.getById(id);
    }
}

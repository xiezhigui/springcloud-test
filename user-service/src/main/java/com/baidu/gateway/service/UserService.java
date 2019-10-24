package com.baidu.gateway.service;


import com.baidu.gateway.mapper.UserMapper;
import com.baidu.gateway.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: XieZhiGui
 * @Date: 2019-9-23
 * @Description: com.baidu.gateway.gateway
 * @version: 1.0
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User getById(int id){
       return userMapper.selectByPrimaryKey(id);
    }
}

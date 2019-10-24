package com.baidu.gateway.controller;


import com.baidu.gateway.client.UserClient;
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
@RestController
@RequestMapping("/user")
//@DefaultProperties(defaultFallback = "fallBack")
public class UserController {

    /*@Autowired
    RestTemplate restTemplate;*/

/*    @Autowired
    DiscoveryClient discoveryClient;*/

    @Autowired
    UserClient userClient;

    @RequestMapping("/{id}")
    //@HystrixCommand
    public String getUser(@PathVariable Integer id){

        /*List<ServiceInstance> instances = discoveryClient.getInstances("user-gateway");
        ServiceInstance serviceInstance = instances.get(0);
        String url="http://user-service/user/"+id;
        String user=restTemplate.getForObject(url,String.class);*/

        String user=userClient.getUser(id);
        return  user;
    }

    public String fallBack(){
        return "系统繁忙，请稍后再试！";
    }
}

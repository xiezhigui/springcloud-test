package com.baidu.gateway.client;

import com.baidu.gateway.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: XieZhiGui
 * @Date: 2019-9-26
 * @Description: com.baidu.gateway.client
 * @version: 1.0
 */
@FeignClient(value="user-service",fallback = UserClientFallback.class,configuration = FeignConfiguration.class)
public interface UserClient {

    @RequestMapping("/user/{id}")
    public String getUser(@PathVariable Integer id);

}

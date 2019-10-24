package com.baidu.gateway.client;

import org.springframework.stereotype.Component;

/**
 * @Auther: XieZhiGui
 * @Date: 2019-9-26
 * @Description: com.baidu.gateway.client
 * @version: 1.0
 */
@Component
public class UserClientFallback implements UserClient {
    @Override
    public String getUser(Integer id) {
        return "请求超时";
    }
}

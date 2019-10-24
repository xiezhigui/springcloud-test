package com.baidu.gateway.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: XieZhiGui
 * @Date: 2019-9-26
 * @Description: com.baidu.gateway.config
 * @version: 1.0
 */
@Configuration
public class FeignConfiguration {

    @Bean
    Logger.Level getLoggerLevel(){
        return Logger.Level.FULL;
    }
}

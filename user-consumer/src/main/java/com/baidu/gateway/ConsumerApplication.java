package com.baidu.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @Auther: XieZhiGui
 * @Date: 2019-9-23
 * @Description: com.baidu.gateway
 * @version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableFeignClients
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class);
    }
    /*@Bean
    @LoadBalanced
    public RestTemplate getTemplate(){
        return new RestTemplate();
    }*/
}

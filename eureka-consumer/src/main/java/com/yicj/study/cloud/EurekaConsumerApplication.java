package com.yicj.study.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//https://blog.csdn.net/u011531425/article/details/81713441
//http://blog.didispace.com/spring-cloud-learning/
//Eureka Client的属性都在EurekaClientConfig类接口中定义处理方法
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(
        		EurekaConsumerApplication.class, args) ;
    }

    //初始化RestTemplate，用来真正发起REST请求
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate() ;
    }
}
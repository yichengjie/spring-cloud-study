package com.yicj.study.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//https://blog.csdn.net/u011531425/article/details/81713441
//http://blog.didispace.com/spring-cloud-starter-dalston-1/
//Eureka Client的属性都在EurekaClientConfig类接口中定义处理方法
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerRibbonApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaConsumerRibbonApplication.class)
            .web(true).run(args);
    }

    //初始化RestTemplate，用来真正发起REST请求
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate() ;
    }
}
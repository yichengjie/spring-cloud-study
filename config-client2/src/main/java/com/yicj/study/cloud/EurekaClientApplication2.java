package com.yicj.study.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//https://www.cnblogs.com/hellxz/p/9306507.html
//Eureka Client的属性都在EurekaClientConfig类接口中定义处理方法
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication2 {
    public static void main(String[] args) {
       SpringApplication.run(EurekaClientApplication2.class, args) ;
    }
}
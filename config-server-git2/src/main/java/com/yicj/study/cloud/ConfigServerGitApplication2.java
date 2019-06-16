package com.yicj.study.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
//https://blog.csdn.net/u011531425/article/details/81713441
//http://blog.didispace.com/spring-cloud-starter-dalston-1/
//Eureka Client的属性都在EurekaClientConfig类接口中定义处理方法
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerGitApplication2 {
    public static void main(String[] args) {
       SpringApplication.run(
    		   ConfigServerGitApplication2.class, args) ;
    }
}
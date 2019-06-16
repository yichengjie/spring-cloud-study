package com.yicj.study.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
//https://blog.csdn.net/u011531425/article/details/81713441
//http://blog.didispace.com/spring-cloud-starter-dalston-1/
//Eureka Client的属性都在EurekaClientConfig类接口中定义处理方法
@EnableConfigServer
@SpringBootApplication
public class ConfigServerGitApplication {
    public static void main(String[] args) {
        SpringApplication.run(
        		ConfigServerGitApplication.class, args) ;
    }
}
package com.yicj.study.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
//https://blog.csdn.net/u011531425/article/details/81713441
//http://blog.didispace.com/spring-cloud-starter-dalston-1/
//Eureka Client的属性都在EurekaClientConfig类接口中定义处理方法
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class EurekaServerApplication2 {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServerApplication2.class)
            .web(true).run(args);
    }
}
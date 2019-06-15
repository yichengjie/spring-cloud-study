package com.yicj.study.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//https://blog.csdn.net/u011531425/article/details/81713441
//http://blog.didispace.com/spring-cloud-learning/
//Eureka Client的属性都在EurekaClientConfig类接口中定义处理方法
@SpringBootApplication
public class SinkApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SinkApplication.class)
            .web(true).run(args);
    }
}
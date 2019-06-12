package com.yicj.study.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//https://www.cnblogs.com/hellxz/p/9306507.html
//Eureka Client的属性都在EurekaClientConfig类接口中定义处理方法
@SpringBootApplication
public class EurekaClientApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaClientApplication.class)
            .web(true).run(args);
    }
}
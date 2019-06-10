package com.yicj.study.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//http://blog.didispace.com/spring-cloud-starter-dalston-1/
//https://blog.csdn.net/qq_19983129/article/details/72458017:
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
    public static void main(String[] args)throws Exception {
    	new SpringApplicationBuilder(EurekaServerApplication.class)
        .web(true).run(args);
    }
}

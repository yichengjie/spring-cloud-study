package com.yicj.study.cloud;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

//https://blog.csdn.net/u011531425/article/details/81713441
//http://blog.didispace.com/spring-cloud-starter-dalston-1/
//Eureka Client的属性都在EurekaClientConfig类接口中定义处理方法
@EnableHystrixDashboard
@SpringCloudApplication
public class HystrixDashboardApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(HystrixDashboardApplication.class)
            .web(true).run(args);
    }
}
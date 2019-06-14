package com.yicj.study.cloud;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.yicj.study.cloud.filter.AccessFilter;

//https://blog.csdn.net/u011531425/article/details/81713441
//http://blog.didispace.com/spring-cloud-learning/
//Eureka Client的属性都在EurekaClientConfig类接口中定义处理方法
@EnableZuulProxy
@SpringCloudApplication
public class ApiGatewayApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApiGatewayApplication.class)
            .web(true).run(args);
    }
    //http://localhost:1101/eureka-consumer/consumer：返回401错误
    //http://localhost:1101/eureka-consumer/consumer?accessToken=token：
    //正确路由到hello-service的/hello接口，并返回Hello World
    @Bean
    public AccessFilter accessFilter() {
    	return new AccessFilter() ;
    }
}
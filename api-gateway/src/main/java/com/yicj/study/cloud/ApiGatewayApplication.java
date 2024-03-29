package com.yicj.study.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
//https://blog.csdn.net/u011531425/article/details/81713441
//http://blog.didispace.com/spring-cloud-learning/
//Eureka Client的属性都在EurekaClientConfig类接口中定义处理方法
@EnableZuulProxy
@SpringCloudApplication
public class ApiGatewayApplication {
    public static void main(String[] args) {
    	SpringApplication.run(ApiGatewayApplication.class, args) ;
    }
    //http://localhost:1101/eureka-consumer/consumer：返回401错误
    //http://localhost:1101/eureka-consumer/consumer?accessToken=token：
    //正确路由到hello-service的/hello接口，并返回Hello World
   /* @Bean
    public AccessFilter accessFilter() {
    	return new AccessFilter() ;
    }*/
}
package com.yicj.study.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import com.spring4all.swagger.EnableSwagger2Doc;
//https://blog.csdn.net/u011531425/article/details/81713441
//http://blog.didispace.com/spring-cloud-learning/
//Eureka Client的属性都在EurekaClientConfig类接口中定义处理方法
//@EnableZuulProxy
@EnableSwagger2Doc
@EnableDiscoveryClient
@SpringBootApplication
//@SpringCloudApplication
public class SwaggerApiGatewayApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SwaggerApiGatewayApplication.class)
            .web(true).run(args);
    }
    //http://localhost:1101/eureka-consumer/consumer：返回401错误
    //http://localhost:1101/eureka-consumer/consumer?accessToken=token：
    //正确路由到hello-service的/hello接口，并返回Hello World
}
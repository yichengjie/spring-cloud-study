package com.yicj.study.cloud;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.spring4all.swagger.EnableSwagger2Doc;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

//https://blog.csdn.net/u011531425/article/details/81713441
//http://blog.didispace.com/spring-cloud-learning/
//Eureka Client的属性都在EurekaClientConfig类接口中定义处理方法
@EnableSwagger2Doc
@EnableZuulProxy
@SpringCloudApplication
public class ApiGatewaySwaggerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApiGatewaySwaggerApplication.class)
            .web(true).run(args);
    }
    //正确路由到hello-service的/hello接口，并返回Hello World
    @Component
    @Primary
    class DocumentationConfig implements SwaggerResourcesProvider {
        @Override
        public List<SwaggerResource> get() {
            List<SwaggerResource> resources = new ArrayList<SwaggerResource>();
            resources.add(swaggerResource("service-a", "/swagger-service-a/v2/api-docs", "2.0"));
            resources.add(swaggerResource("service-b", "/swagger-service-b/v2/api-docs", "2.0"));
            return resources;
        }

        private SwaggerResource swaggerResource(String name, String location, String version) {
            SwaggerResource swaggerResource = new SwaggerResource();
            swaggerResource.setName(name);
            swaggerResource.setLocation(location);
            swaggerResource.setSwaggerVersion(version);
            return swaggerResource;
        }
    }
}
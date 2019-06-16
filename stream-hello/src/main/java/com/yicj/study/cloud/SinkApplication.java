package com.yicj.study.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//https://blog.csdn.net/u011531425/article/details/81713441
//http://blog.didispace.com/spring-cloud-learning/
//Eureka Client的属性都在EurekaClientConfig类接口中定义处理方法
@SpringBootApplication
public class SinkApplication {
    public static void main(String[] args) throws Exception {
    	//org.hibernate.validator.internal.engine.ConfigurationImpl
//    	URL resource = SinkApplication.class.getClassLoader().getResource("org/hibernate/validator/internal/engine/ConfigurationImpl.class");
//    	System.out.println(resource);
    	//.loadClass("org/hibernate/validator/internal/engine/ConfigurationImpl.class").get ;
        SpringApplication.run(SinkApplication.class, args) ;
    }
    
    
}
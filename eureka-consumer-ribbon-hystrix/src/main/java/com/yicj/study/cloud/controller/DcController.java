package com.yicj.study.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@RestController
public class DcController {
	
	@Autowired
	private ConsumerService consumerService ;

    @GetMapping("/consumer")
    public String dc() {
        return consumerService.consumer() ;
    }
    
    @GetMapping("/consumer2")
    public String dc2() {
        return consumerService.consumer2() ;
    }
    
    
    @Service
    class ConsumerService{
    	@Autowired
    	private RestTemplate restTemplate ;
    	
    	@HystrixCommand(fallbackMethod = "fallback")
    	public String consumer() {
    		return restTemplate.getForObject("http://eureka-client/dc", String.class);
    	}
    	
    	@HystrixCommand(fallbackMethod = "fallback")
    	public String consumer2() {
    		return restTemplate.getForObject("http://eureka-client/dc2", String.class);
    	}
    	
    	public String fallback() {
    		return "fallback" ;
    	}
    }
}

package com.yicj.study.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class DcController {

    @Autowired
    private LoadBalancerClient loadBalancerClient ;

    @Autowired
    private RestTemplate restTemplate ;

    @GetMapping("/consumer")
    public String dc() {
        ServiceInstance serviceInstance =
                this.loadBalancerClient.choose("eureka-client") ;
        String url = "http://" + serviceInstance.getHost()+":"
                + serviceInstance.getPort() +"/dc" ;
        log.info("url :{}",url);
        return restTemplate.getForObject(url,String.class) ;
    }
}

package com.yicj.study.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class DcController {

    @Autowired
    private RestTemplate restTemplate ;

    @GetMapping("/consumer")
    public String dc() {
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }
}

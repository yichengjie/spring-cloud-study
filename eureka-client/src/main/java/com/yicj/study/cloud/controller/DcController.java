package com.yicj.study.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DcController {

	@Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() {
        String services = "Services: " + discoveryClient.getServices();
        log.info("provider service ======> " + services);
        return services;
    }
    
    @GetMapping("/dc2")
    public String dc2() throws InterruptedException {
    	Thread.sleep(5000L);
        String services = "Services: " + discoveryClient.getServices();
        log.info("provider service ======> " + services);
        return services;
    }
}

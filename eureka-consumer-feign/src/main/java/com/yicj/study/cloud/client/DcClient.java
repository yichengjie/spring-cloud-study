package com.yicj.study.cloud.client;

import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client")
public interface DcClient {
    @GetMapping("/dc")
    String consumer() ;
}

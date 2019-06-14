package com.yicj.study.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yicj.study.cloud.client.DcClient;

@RestController
public class DcController {
    @Autowired
    private DcClient dcClient ;

    @GetMapping("/consumer")
    public String dc() {
        return dcClient.consumer() ;
    }
}

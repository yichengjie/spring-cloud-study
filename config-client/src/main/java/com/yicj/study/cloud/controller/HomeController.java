package com.yicj.study.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //开启更新功能
@RequestMapping("api")
public class HomeController {
	@Value("${info}")
	private String info ;
	
	@GetMapping("hello")
	public String hello() {
		return info ;
	}
}

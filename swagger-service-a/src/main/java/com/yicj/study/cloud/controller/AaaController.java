package com.yicj.study.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class AaaController {
	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/service-a")
	public String dc() {
		String service = "Service: " + discoveryClient.getServices();
		log.info("======> " + service);
		return service;
	}
}
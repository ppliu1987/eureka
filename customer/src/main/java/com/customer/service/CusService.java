package com.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CusService {
	@Autowired
	RestTemplate template;
	
	public String hello(String name){
		return template.getForObject("http://SERVICE-PROVIDER/hello?name="+name, String.class);
	}

}

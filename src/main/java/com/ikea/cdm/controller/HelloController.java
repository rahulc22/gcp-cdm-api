package com.ikea.cdm.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class represents Web Controller to test the application
 * TODO: deleted
 *
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		StringBuilder message = new StringBuilder("Hello Google App Engine!");
		try {
			InetAddress ip = InetAddress.getLocalHost();
			message.append(" From host: " + ip);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return message.toString();
	}
	
	@RequestMapping("/test")
	public String test() {
		StringBuilder message = new StringBuilder("Test!!! Hello Google App Engine!");
		return message.toString();
	}

}
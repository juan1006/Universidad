package com.springbase.base.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbase.base.bean.Message;

@RestController
public class HelloWorldRestController {
 
	@RequestMapping("/")
	public String init() {
		System.out.println("Init");
		return "";
	}
	
    @RequestMapping(value = "/hello/{player}", method = RequestMethod.GET)
    public String message(@PathVariable String player) {
    	
        Message msg = new Message();
        msg.setName(player);
        msg.setText("Hello" + player);
        return msg.toJsonString();
    }
 
}

package com.lxi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login")
	@ResponseBody
	public String login()
	{
		return("Login done");
	}
	
	@RequestMapping(value="/register")
	@ResponseBody
	public String register()
	{
		return("registeration done");
	}
}

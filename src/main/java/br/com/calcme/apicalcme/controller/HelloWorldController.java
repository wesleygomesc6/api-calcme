package br.com.calcme.apicalcme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	@RequestMapping("/api-calcme")
	@ResponseBody
	public String hello() {
		return "Hello World!";
	}
}

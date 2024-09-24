package com.teampl.stmngsys.main.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/")
public class MainController {

	@GetMapping("/")
	public String getMethodName(@RequestParam String param) {
		return new String();
	}
	
	//ajax 용
	@PostMapping("")
	public @ResponseBody Map postMethodName(@RequestBody Map param) {
		Map rtnMap = new HashMap<>();
		
		return rtnMap;
	}
	
	
	
}

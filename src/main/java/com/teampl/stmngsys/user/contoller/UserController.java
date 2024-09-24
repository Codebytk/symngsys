package com.teampl.stmngsys.user.contoller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.teampl.stmngsys.user.service.UserService;

@Controller
@RequestMapping("/edusys/user")
public class UserController {

	private UserService userService;
	
	@PostMapping("/")
	public @ResponseBody Map userCreate(@RequestBody Map param) {
		
		return null;
	}
}

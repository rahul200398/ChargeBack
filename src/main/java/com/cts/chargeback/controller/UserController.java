package com.cts.chargeback.controller;

import java.util.List;

import javax.persistence.Id;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.cts.chargeback.entity.User;
import com.cts.chargeback.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
    
	@GetMapping("/show")
	public String showForm(){
		
		/*userService.saveUser(user);*/
		return "login";
	}
	
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") User user){
			userService.saveUser(user);
			return "login";	
	}
	
	@GetMapping("/showRegistration")
	public String showRegistrationForm(){
		return "registration";	
	}
	
	
	/*@GetMapping("/homepage")
	public String homePage(Model model){
		List<Customer>ls= userService.getlist();
		return "homepage";
	}*/
}

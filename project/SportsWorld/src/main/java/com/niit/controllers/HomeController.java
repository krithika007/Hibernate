package com.niit.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
@RequestMapping("/home")
public String homePage(){
	return "home";
	
}
@RequestMapping("/aboutus")
public String aboutUs(){
	return "aboutus";
	
	
}
@RequestMapping("/footer")
public String footer(){
	return "aboutus";
	
	
}
@RequestMapping("/header")
public String header(){
	return "aboutus";
	
	
}

}

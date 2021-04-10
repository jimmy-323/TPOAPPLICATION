package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Working Sucessfully!!!
@Controller
public class Control {
	
@RequestMapping("/")
String home(Model m)
{
	m.addAttribute("name","Javed");
	return"home";
}

}

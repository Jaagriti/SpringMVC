package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	
	@RequestMapping("/showForm")
	public String showModel(Model m)
	{
		
		Student theStudent=new Student();
		m.addAttribute("student", theStudent);
		return "student-form";
		
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student")Student theStudent)
	
	{
		System.out.println("theStudent: " +theStudent.getFname() + " " + theStudent.getLname());
		return "student-confirmation";
	}
	

}

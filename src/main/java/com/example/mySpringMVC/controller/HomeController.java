package com.example.mySpringMVC.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/myTest")
	public ModelAndView myTest(HttpServletResponse response) throws IOException{
		return new ModelAndView("myView");
	}//Close myTest
	
	@RequestMapping(value="/showForm")
	public String showForm() {
		return "showForm";
	}//Close showForm method.
	
	@RequestMapping(value="/processForm")
	public String processForm(HttpServletRequest resquest, Model model) {
		
		String name = "Uppercase " +resquest.getParameter("studentName").toUpperCase();
		model.addAttribute("message", name);
		return "testForm";
		
	}//Close processForm method.
	
	@RequestMapping(value="/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName")String name, Model model) {
		model.addAttribute("message", "Hello my friend from V3! "+name.toUpperCase());
		return "testForm";
	}//Close processFormVersionThree.
	
}

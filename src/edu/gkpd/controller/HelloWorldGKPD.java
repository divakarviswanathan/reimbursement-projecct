package edu.gkpd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldGKPD {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		ModelAndView mv = new ModelAndView("welcome");
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This "
				+ "message is coming from HelloWorldGKPD.java **********</div><br><br>";
		mv.addObject( "message", message);
		return mv;
	}
}

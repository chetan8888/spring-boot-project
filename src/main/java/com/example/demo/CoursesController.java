package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoursesController {
	
	@RequestMapping("/course")
	public ModelAndView courses(@RequestParam("cname") String courseName) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("course");
		mv.addObject("cname", courseName);
		return mv;
				
	}

}

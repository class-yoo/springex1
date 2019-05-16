package com.cafe24.springex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "/WEB-INF/views/hello.jsp";
	}
	
	@RequestMapping("/hello2")
	public ModelAndView hello2() {

		ModelAndView mav = new ModelAndView();
		mav.addObject("email", "yujaehyeong@naver.com");
		mav.setViewName("/WEB-INF/views/hello.jsp");
		return mav;
	}
	
	@RequestMapping("/hello3")
	public String hello3(Model model) {
		
		model.addAttribute("email", "yujaehyeong@naver.com");
		
		return "/WEB-INF/views/hello.jsp";
	}

	@RequestMapping("/hello4")
	// get 방식의 parameter로 왔을때 변수안에 매핑된 값을 가져온다
	// ex) localhost:8080/springex1/hello4?email= star@naver.com 일 경우 
	// star@naver.com이 파라미터 email로 들어온다.
	// 어노테이션에 value 생략시 변수이름으로 request parameter name으로 변수값을 찾는다.
	public String hello4(Model model, @RequestParam("email") String email,
			@RequestParam String name) { 
		
		
		model.addAttribute("email", email);
		model.addAttribute("name", name);
		
		return "/WEB-INF/views/hello.jsp";
	}
	
	// 기술이 침투했기 때문에 비추천
	@RequestMapping("/hello5")
	public String hello5(Model model, HttpServletRequest request) {
		
		String email = request.getParameter("email");
		String name = request.getParameter("name"); 
		
		model.addAttribute("email", email);
		model.addAttribute("name", name);
		
		return "/WEB-INF/views/hello.jsp";
	}
	
}

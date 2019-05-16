package com.cafe24.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RequestMapping
//type 단독매핑

@Controller
@RequestMapping("/guestbook/*")
public class GuestBookController {

	
	@ResponseBody
	@RequestMapping
	// localhost:8080/springex1/geustbook/list로 접근하면 접근가능 메소드 이름으로 접근하는방식
	// - 타입 단독매핑
	public String list() {
			
		return "GuestbookController:list";
		
	}
	
}

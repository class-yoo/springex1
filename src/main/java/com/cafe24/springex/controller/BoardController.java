package com.cafe24.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// @RequestMapping
// Method 단독 매핑

@Controller
public class BoardController {

	@ResponseBody
	@RequestMapping("/board/update")
	public String update(
//			String name
//			@RequestParam String name
//			아래꺼 추천!!  파라미터의 이름을 바꿀수도 있음
			@RequestParam("name") String name) {

		System.out.println(name);

		return "BoardController:update()";
	}

	@ResponseBody
	@RequestMapping("/board/write")
	public String write(
			// required=false로 설정해두면 파라미터 안넘어와도 400 bed request 오류 안남 기본적으로 true로 설정되어 있음
			// true로 해두고 defaultValue 값 설정해두면 값 안넣어도 디폴트값으로 설정돼서 오류안남
			@RequestParam(value="n", required=true, defaultValue="") String name,
			@RequestParam(value="age", required=true, defaultValue="0") int age
			
	) {
		System.out.println(name);
		System.out.println(age);
		
		return "BoardController:write()";
	}

	@ResponseBody
	@RequestMapping("/board/view")
	public String view() {

		return "BoardController:view()";
	}

}

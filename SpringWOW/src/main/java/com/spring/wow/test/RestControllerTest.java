package com.spring.wow.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController//스프링 4부터 사용가능 자체적으로 @ResponseBody 어노테이션 포함
@RequestMapping("/rest")
public class RestControllerTest {

	/*
	 
	 @ResponseBody 
	 - 리턴 데이터를 ViewResolver 에게 전달하지 않고 
	 클라이언트에게 해당 데이터를 바로 응답하게 합니다.
	 
	 */
	
	
	@GetMapping("/hello")
	//@ResponseBody
	public String hello() {
		return "Hello World!";
	}
	
	@GetMapping("/hobbys")
	//@ResponseBody
	public List<String> hobbys(){
		List<String> hobbys = Arrays.asList("축구", "수영", "음악감상");
		return hobbys;
	}
	
	
	@GetMapping("/study")
	//@ResponseBody
	public Map<String, Object> study(){
		Map<String, Object> subject = new HashMap<>();
		subject.put("자바", "java");
		subject.put("JSP", "java Server Pages");
		subject.put("Spring", "Spring FrameWork 5");
		
		return subject;
	}
	
	
	@GetMapping("/person")
	//@ResponseBody
	public Person person() {
		Person p = new Person();
		
		p.setName("김철수");
		p.setAge(30);
		p.setHobbys(Arrays.asList("수영", "탁구" , "요리"));
		
		return p;
	}
	
	
}

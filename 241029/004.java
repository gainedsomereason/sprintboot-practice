package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/he")
public class HelloController {
//	@ResponseBody
//	@RequestMapping("hello")
//	public String hello() {
//		return "hello world";
//	}
	@ResponseBody
	@RequestMapping("/simpleParam")
//	public String simpleParam(HttpServletRequest request) {
//		String name=request.getParameter("name");
//		String ageStr=request.getParameter("age");
//		int age=Integer.parseInt(ageStr);
//		System.out.println(name+" ,"+age);
//		return "OK";
//	}
	public String simpleParam(String name,int age) {
		System.out.println(name+":"+age);
		return "OK";
	}
	
}
/**
HttpServletRequest对象获取请求参数localhost:8080/simpleParam?name=hi&age=8
使用URI 模板
public ModelAndView showView( @PathVariable String variable1, @PathVariable ( "variable2" ) int variable2)
请求参数到控制器方法参数
 public String testRequestParam( @RequestParam(required=false) String name, @RequestParam ( "age" ) int age) 
绑定 cookie 的值到 Controller 方法参数
 public String testCookieValue( @CookieValue ( "hello" ) String cookieValue, @CookieValue String hello) 
 使用 @RequestHeader 注解绑定 HttpServletRequest 头信息到Controller 方法参数
 public String testRequestHeader( @RequestHeader ( "Host" ) String hostAddr, @RequestHeader String Host, @RequestHeader String host )
 

 */

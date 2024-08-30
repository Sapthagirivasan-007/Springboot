package com.springex1.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController{
	
	@GetMapping("/mark")
	public int addMark(@RequestParam("a")int op1,@RequestParam("b")int op2) {
	return op1+op2;
}
	@GetMapping("/marks")
	public int subt(@RequestParam("a")int op1,@RequestParam("b")int op2) {
		return op1-op2;
	}
}
package com.capgemini.onlinetest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onlinetest.entity.Questions;
import com.capgemini.onlinetest.entity.Test;
import com.capgemini.onlinetest.service.QuestionsService;
import com.capgemini.onlinetest.service.TestService;



@RestController
@RequestMapping("/q")
public class AdminController {
	@Autowired
	QuestionsService ser;
	@Autowired
	TestService tser;
	
	@PostMapping("/question")
	public Questions addQ(@RequestBody Questions q) {
		return ser.save(q);
	}
	
	@PostMapping("/test")
	public Test addT(@RequestBody Test t) {
		return tser.save(t);
	}
	
	/*	@PostMapping("/{test}/question")
	public Questions addQuestion(@PathVariable(value="test") long test,@RequestBody Questions q)
	{
		Questions q1=new Questions();
		
	}
	*/
}

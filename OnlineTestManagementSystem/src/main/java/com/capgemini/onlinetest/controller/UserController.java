package com.capgemini.onlinetest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onlinetest.entity.Questions;
import com.capgemini.onlinetest.entity.Test;
import com.capgemini.onlinetest.service.QuestionsService;
import com.capgemini.onlinetest.service.TestService;



@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	QuestionsService ser;
	@Autowired
	TestService tser;
	
	//get all test
	@GetMapping("/gett")
	public List<Test> findT() {
		return tser.getAll();
	}
	
	
}

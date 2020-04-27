package com.capgemini.onlinetest.service;

import java.util.List;

import com.capgemini.onlinetest.entity.Questions;
import com.capgemini.onlinetest.entity.Test;

public interface TestService {

	public Test save(Test t);
	public Test findOne(int testid);
	public void deleteT(Test t);
	public List<Test> getAll();
}

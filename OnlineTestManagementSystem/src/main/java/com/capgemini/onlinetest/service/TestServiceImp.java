package com.capgemini.onlinetest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinetest.dao.TestRepository;
import com.capgemini.onlinetest.entity.Questions;
import com.capgemini.onlinetest.entity.Test;



@Service
@Transactional
public class TestServiceImp implements TestService{
	@Autowired
	TestRepository trep;
	
	@Override
	public Test save(Test t) {
		return trep.save(t);
	}

	@Override
	public Test findOne(int testid) {
		// TODO Auto-generated method stub
		return trep.getOne(testid);
	}

	@Override
	public void deleteT(Test t) {
		// TODO Auto-generated method stub
		trep.delete(t);
	}

	@Override
	public List<Test> getAll() {
		// TODO Auto-generated method stub
		return trep.findAll();
	}
}
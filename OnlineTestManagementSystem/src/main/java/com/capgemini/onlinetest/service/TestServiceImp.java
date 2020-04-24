package com.capgemini.onlinetest.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinetest.dao.TestRepository;
import com.capgemini.onlinetest.entity.Test;



@Service
@Transactional
public class TestServiceImp implements TestService{
	@Autowired
	TestRepository trep;
	
	public Test save(Test t) {
		return trep.save(t);
	}
}
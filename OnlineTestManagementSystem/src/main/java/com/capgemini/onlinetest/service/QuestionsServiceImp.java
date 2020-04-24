package com.capgemini.onlinetest.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinetest.dao.QuestionsRepository;
import com.capgemini.onlinetest.entity.Questions;



@Service
@Transactional
public class QuestionsServiceImp implements QuestionsService{
	@Autowired
	QuestionsRepository qrep;
	
	public Questions save(Questions q) {
		return qrep.save(q);
	}
}
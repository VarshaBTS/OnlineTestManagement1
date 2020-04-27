package com.capgemini.onlinetest.service;

import java.util.List;
import java.util.Optional;

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
	
	@Override
	public Questions save(Questions q) {
		return qrep.save(q);
	}

	@Override
	public Questions findOne(int qid) {
		return qrep.getOne(qid);
	}

	@Override
	public Optional<Questions> findQuestionById(int qid) {
		return qrep.findById(qid);
	}

	@Override
	public void deleteQ(Questions q) {
		qrep.delete(q);
	}

	@Override
	public List<Questions> getAll() {
		return qrep.findAll();
	}
}
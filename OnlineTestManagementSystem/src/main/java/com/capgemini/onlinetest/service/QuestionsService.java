package com.capgemini.onlinetest.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.onlinetest.entity.Questions;

public interface QuestionsService {

	public Questions save(Questions q);
	public Questions findOne(int qid);
	public Optional<Questions> findQuestionById(int qid);
	public void deleteQ(Questions q);
	public List<Questions> getAll();
	public Questions updateQuestion(Questions q);
	
}

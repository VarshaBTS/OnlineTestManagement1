package com.capgemini.onlinetest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.onlinetest.entity.Questions;


@Repository
public interface QuestionsRepository extends JpaRepository<Questions,Integer>{

	/*
	@Modifying	
	@Query("UPDATE q FROM Questions_otm q WHERE q.qid=?")
	public Questions UpdateQuestion(int qid);
	*/
}

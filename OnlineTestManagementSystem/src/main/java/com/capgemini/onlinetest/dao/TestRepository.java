package com.capgemini.onlinetest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.onlinetest.entity.Test;



@Repository
public interface TestRepository extends JpaRepository<Test,Long>{

}
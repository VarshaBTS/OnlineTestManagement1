package com.capgemini.onlinetest.service;

import java.util.List;

import com.capgemini.onlinetest.entity.Userdata;

public interface UserService {

	Userdata addUser(Userdata u);


	List<Userdata> getAllUsers();

	Userdata deleteUser(int userId);

	Userdata updateUser(Userdata u);
	
    //Boolean loginUser(Userdata u);
	String loginUser(Userdata u);

}
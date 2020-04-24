package com.capgemini.onlinetest.entity;

import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="QuestionsO")
public class Questions {

	@Id
	private int qid;
	private String qtitle;
	@JsonProperty("qo")
	private HashMap<Integer,String> qoptions;
	private int qans;
	private long qmarks;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQtitle() {
		return qtitle;
	}
	public void setQtitle(String qtitle) {
		this.qtitle = qtitle;
	}
	public HashMap<Integer, String> getQoptions() {
		return qoptions;
	}
	public void setQoptions(HashMap<Integer, String> qoptions) {
		this.qoptions = qoptions;
	}
	public int getQans() {
		return qans;
	}
	public void setQans(int qans) {
		this.qans = qans;
	}
	public long getQmarks() {
		return qmarks;
	}
	public void setQmarks(long qmarks) {
		this.qmarks = qmarks;
	}
}

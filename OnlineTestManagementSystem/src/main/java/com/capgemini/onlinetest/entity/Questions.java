package com.capgemini.onlinetest.entity;

import java.util.HashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name="Questions_otm")
public class Questions {
	
	@Id
	@Column(name="qid")
	private int qid;
	private String qtitle;
	private String opt1;
	private String opt2;
	private int qans;
	private long qmarks;
	private int choosenAns;
	private long marksScored;
	
	public String getOpt1() {
		return opt1;
	}
	public int getChoosenAns() {
		return choosenAns;
	}
	public void setChoosenAns(int choosenAns) {
		this.choosenAns = choosenAns;
	}
	public long getMarksScored() {
		return marksScored;
	}
	public void setMarksScored(long marksScored) {
		this.marksScored = marksScored;
	}
	public void setOpt1(String opt1) {
		this.opt1 = opt1;
	}
	public String getOpt2() {
		return opt2;
	}
	public void setOpt2(String opt2) {
		this.opt2 = opt2;
	}
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


/*
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
*/
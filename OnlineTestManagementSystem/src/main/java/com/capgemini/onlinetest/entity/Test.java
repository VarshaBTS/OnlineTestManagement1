package com.capgemini.onlinetest.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="Test_otm")
public class Test {
	
	@Id
//	@GeneratedValue
	@Column(name="t_id")
	private int testid;
	private String testtitle;
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	@OneToMany(targetEntity=Questions.class,cascade=CascadeType.ALL)
	@JoinColumn(name="testid",referencedColumnName="t_id")
	private List<Questions> tquestions;
	private long testtotalmarks;
	private long testmarksScored;
	public int getTestid() {
		return testid;
	}
	public void setTestid(int testid) {
		this.testid = testid;
	}
	public String getTesttitle() {
		return testtitle;
	}
	public void setTesttitle(String testtitle) {
		this.testtitle = testtitle;
	}
	public List<Questions> getTquestions() {
		return tquestions;
	}
	public void setTquestions(List<Questions> tquestions) {
		this.tquestions = tquestions;
	}
	public long getTesttotalmarks() {
		return testtotalmarks;
	}
	public void setTesttotalmarks(long testtotalmarks) {
		this.testtotalmarks = testtotalmarks;
	}
	public long getTestmarks() {
		return testmarksScored;
	}
	public void setTestmarks(long testmarks) {
		this.testmarksScored = testmarks;
	}
	
	
}


/*
@Entity
@Table(name="TestO")
public class Test {
	@Id
	private int testid;
	private String testtitle;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JsonProperty("tques")
	//@JoinTable(name="Test_Question")
	private Set<Questions> testques;
	private long testtotalmarks;
	private long testmarks;
	public int getTestid() {
		return testid;
	}
	public void setTestid(int testid) {
		this.testid = testid;
	}
	public String getTesttitle() {
		return testtitle;
	}
	public void setTesttitle(String testtitle) {
		this.testtitle = testtitle;
	}
	
	public Set<Questions> getTestques() {
		return testques;
	}
	public void setTestques(Set<Questions> testques) {
		this.testques = testques;
	}
	public long getTesttotalmarks() {
		return testtotalmarks;
	}
	public void setTesttotalmarks(long testtotalmarks) {
		this.testtotalmarks = testtotalmarks;
	}
	public long getTestmarks() {
		return testmarks;
	}
	public void setTestmarks(long testmarks) {
		this.testmarks = testmarks;
	}
}
*/

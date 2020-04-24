package com.capgemini.onlinetest.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonProperty;

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

package com.bcampbell.discgolf.models;

public class Course {

	private String name;
	private String address;
	private Integer holeNum;
	private String difficulty;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getHoleNum() {
		return holeNum;
	}
	public void setHoleNum(Integer holeNum) {
		this.holeNum = holeNum;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	
}

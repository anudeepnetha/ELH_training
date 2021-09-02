package com.model;

public class Student {
	private int studId;
	private String studName;
	private int age;

	public Student() {
		super();
	}

	public Student(int studId, String studName, int age) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.age = age;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

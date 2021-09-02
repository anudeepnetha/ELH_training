package com.model;

public class Department  {
	
	private int depId;
	private String deptName;
	private Student[] student;
	public Department() {
		super ();
	}
	public Department(int depId, String deptName, Student[] student) {
		super();
		this.depId = depId;
		this.deptName = deptName;
		this.student = student;
	}
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Student[] getStudent() {
		return student;
	}
	public void setStudent(Student[] student) {
		this.student = student;
	}
	

}

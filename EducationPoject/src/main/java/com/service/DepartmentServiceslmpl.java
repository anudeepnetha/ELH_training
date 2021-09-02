package com.service;

import com.model.Department;
import com.model.Student;

public class DepartmentServiceslmpl implements DepartmentServices {

	@Override
	public Student searchStudent(Department department, int search) {
		 Student dummyStudent = null;
		 Student[] studentArray = department.getStudent();
		 for (int i = 0; i < studentArray.length; i++) {
			 if(studentArray[i].getStudId() == search)
			 {
				dummyStudent = studentArray[i] ;
			  
			 }
		 }
		return dummyStudent;
	}

}

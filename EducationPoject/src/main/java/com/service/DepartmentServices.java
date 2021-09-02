package com.service;

import com.model.Department;
import com.model.Student;

public interface DepartmentServices {
	
	public abstract  Student searchStudent(Department department ,int search);

}

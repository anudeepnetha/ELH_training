package com.main;

import com.model.Department;
import com.model.Student;
import com.service.DepartmentServices;
import com.service.DepartmentServiceslmpl;

public class EducatonApp;{
	public static void main(String[] args) {
		
		Student student1 = new Student(123, "Hello", 22 );
		
		Student student2 = new Student(987, "World", 23 );
		
		Student student3 = new Student(789, "Good", 22 );
		
		Department department = new Department();
		department.setDepId(420);
        department.setDeptName("computer science");
        
        Student[] student = new Student[3];
        student[0] = student1;
        student[1] = student2;
        student[2] = student3;
        department.setStudent(student);
        
        //interface name variable = new Interface_Implementation_Class()
       
        DepartmentServices departmentService = new DepartmentServiceslmpl() ;
        Student Student = departmentService.searchStudent(department, 987);
        if(Student != null) {
        	System.out.println(" Student number : "  +  Student.getStudId());
        	System.out.println(" Student name  : "  +  Student.getStudName());
        	System.out.println("  Age            : " + Student.getAge());
        }
	}

}

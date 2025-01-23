package com.redbus.webservice.app.servicei;

import java.util.List;

import com.redbus.webservice.app.model.Student;

public interface StudentServiceI {

	public Student addData(Student s);

	public List<Student> getstudent();

	public Student updateData(Student s);

	public void deletedata(int id);

}

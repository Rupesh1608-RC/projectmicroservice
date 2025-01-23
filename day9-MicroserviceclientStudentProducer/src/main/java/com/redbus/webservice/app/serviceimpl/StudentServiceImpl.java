package com.redbus.webservice.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redbus.webservice.app.model.Student;
import com.redbus.webservice.app.repository.StudentRepo;
import com.redbus.webservice.app.servicei.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI {

	@Autowired
	StudentRepo sr;

	@Override
	public Student addData(Student s) {

		Student stu = sr.save(s);

		return stu;

	}

	@Override
	public List<Student> getstudent() {

		List<Student> list = (List<Student>) sr.findAll();
		return list;
	}

	@Override
	public Student updateData(Student s) {

		Student stu = sr.save(s);
		return stu;
	}

	@Override
	public void deletedata(int id) {
		
		        sr.deleteById(id);
		
	}

}

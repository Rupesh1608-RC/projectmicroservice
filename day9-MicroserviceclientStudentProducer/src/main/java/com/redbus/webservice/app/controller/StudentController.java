package com.redbus.webservice.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.redbus.webservice.app.model.Student;
import com.redbus.webservice.app.servicei.StudentServiceI;

import jakarta.ws.rs.Path;

@RestController
public class StudentController {

	@Autowired
	StudentServiceI ssi;

	@PostMapping("/addstudent")
	public Student addData(@RequestBody Student s) {

		Student stu = ssi.addData(s);

		return stu;

	}

	@GetMapping("/getallstudent")
	public List<Student> getall() {

		List<Student> li = ssi.getstudent();

		return li;

	}

	@PutMapping("/updatestudent")
	public Student updateData(@RequestBody Student s) {

		Student stu = ssi.updateData(s);

		return stu;
	}

	@DeleteMapping("/deletestu/{id}")
	public String deleteData(@PathVariable int id) {

		ssi.deletedata(id);

		return "deleted sucessfully..!";

	}

}

package com.redbus.webservice.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.redbus.webservice.app.model.Student;

@RestController
public class StudentController {

	@Autowired
	RestTemplate rs;

	@GetMapping("/getall")
	public List<Student> getall() {

		//String url = "http://localhost:7777/getallstudent";

		String url = "http://zuul/pro/getallstudent";

		List<Student> list = rs.getForObject(url, List.class);

		return list;

	}

	@PutMapping("/updatecon")
	public String updatedata(@RequestBody Student s) {

		String url = "http://zuul/pro/updatestudent";

		rs.put(url, s);

		return "updated sucessfully!";
	}

	@DeleteMapping("/deletecon/{id}")
	public String deletedata(@PathVariable int id) {

		String url = "http://zuul/pro/deletestu/" + id;

		rs.delete(url);

		return "delete sucessfully...!";
	}

}
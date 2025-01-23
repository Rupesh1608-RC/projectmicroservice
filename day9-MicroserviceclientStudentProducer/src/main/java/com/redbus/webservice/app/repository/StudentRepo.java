package com.redbus.webservice.app.repository;

import org.springframework.data.repository.CrudRepository;


import org.springframework.stereotype.Repository;

import com.redbus.webservice.app.model.Student;
@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {

}

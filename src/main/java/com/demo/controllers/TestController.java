package com.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.model.Employee;

@SpringBootApplication
@RestController
public class TestController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("Pradnya");
		emp.setDesignation("software engineer");
		emp.setEmpId("1");
		emp.setSalary(30000000);

		return emp;
	}

}

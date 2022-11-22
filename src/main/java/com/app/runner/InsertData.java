package com.app.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.dept;
import com.app.model.employee;
import com.app.repo.deptRepository;
import com.app.repo.employeeRepository;

@Component
public class InsertData implements CommandLineRunner {

	@Autowired
	private deptRepository deptRepo;
	
	@Autowired
	private employeeRepository empRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
	employee e1=new employee(101,"Avinash",4.5);
	employee e2=new employee(102,"Amit",5.0);
	employee e3=new employee(103,"Rahul",6.0);
	employee e4=new employee(104,"Nitin",6.5);
	
	empRepo.save(e1);
	empRepo.save(e2);
	empRepo.save(e3);
	empRepo.save(e4);
	
	dept dept1=new dept(201,"Dev","Ajay",Arrays.asList(e1,e2,e3));
	dept dept2=new dept(202,"QA","Prashant",Arrays.asList(e4));
	
	deptRepo.save(dept1);
	deptRepo.save(dept2);

	
	
	


	

	}

}

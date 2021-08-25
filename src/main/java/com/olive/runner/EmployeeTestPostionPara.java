package com.olive.runner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sound.midi.Soundbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.olive.model.Employee;
import com.olive.repo.EmployeeRepositiory;
//@Component
public class EmployeeTestPostionPara implements CommandLineRunner {
    @Autowired
	private EmployeeRepositiory repo;

	public void run(String... args) throws Exception {
		System.out.println("Application Started...................");
		
		repo.save(new Employee(10, "Ravi", 40.0, "Hyd"));
		repo.save(new Employee(20, "Manoj", 4044.0, "LKO"));
		repo.save(new Employee(30, "Sanoj", 404.0, "Hyd"));
		repo.save(new Employee(40, "Somesh", 440.0, "Ameerpet"));
		repo.save(new Employee(50, "Ajit", 403.0, "Hyd"));
		repo.save(new Employee(60, "Ramesh", 410.0, "lko"));
		repo.save(new Employee(70, "Sunil", 400.0, "Varanasi"));
		
		
		
	System.out.println("Fetching Record Based on Postional Parameter");	
	/*
	 * fetching One Row Record Data using Positional Parameter
	 */
               Employee emp = repo.getEmployeeById(20);
               System.out.println("Getting Record by Id :: " + emp);
               
               Employee emp1 = repo.getEmployeeByName("Ajit");
               System.out.println("Record :: " + emp1);
               
               Employee employeeByNameSal = repo.getEmployeeByNameSal(40, "Somesh", 440.0);
               System.out.println("Employee by Id,Name,Sal ::"+employeeByNameSal);
               System.out.println("--------------------------------------------");
               String empName = repo.getEmpName("Ravi");
               System.out.println("Receving Data :: " + empName);
               
               Object[] ob = (Object[])repo.getEmpNameAndSalBySal(4044.0);
               System.out.println("EmpNameAndSalBySal" + ob[0] +"--------" + ob[1]);
	   
               Employee employeeByIdAndNameOrSal = repo.getEmployeeByIdAndNameOrSal(70, "Sunil", 0.0);
               System.out.println("EmployeeByIdAndNameOrSal" + employeeByIdAndNameOrSal);
               
	   }
	}
    

	



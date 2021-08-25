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
@Component
public class EmployeeTestNameParamConcept implements CommandLineRunner {
	@Autowired
	private EmployeeRepositiory repo;

	public void run(String... args) throws Exception {
		System.out.println("Application Started...................");




		System.out.println("Fetching Record Based on Name Parameter");	
		/*
		 * fetching One Row Record Data using Positional Parameter
		 */
		Employee emp = repo.getEmployeeByIdNameParam(20);
		System.out.println("Getting Record by Id :: " + emp);

		Employee emp1 = repo.getEmployeeByNameNameParam("Ajit");
		System.out.println("Record :: " + emp1);

		Employee employeeByNameSal = repo.getEmployeeByNameSalNameParam("Sanoj", 404.0, 30);
		System.out.println("Employee by Id,Name,Sal ::"+employeeByNameSal);
		System.out.println("--------------------------------------------");
		String empName = repo.getEmpNameNameParam("Ravi");
		System.out.println("Receving Data :: " + empName);

		Object[] ob = (Object[])repo.getEmpNameAndSalBySalNameParam(4044.0);
		System.out.println("EmpNameAndSalBySal" + ob[0] +"--------" + ob[1]);

		Employee employeeByIdAndNameOrSal = repo.getEmployeeByIdAndNameOrSalNameParam(70, 0.0, "Sunil");
		System.out.println("EmployeeByIdAndNameOrSal" + employeeByIdAndNameOrSal);

	}
}






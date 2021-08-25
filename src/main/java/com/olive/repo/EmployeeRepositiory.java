package com.olive.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.olive.model.Employee;

public interface EmployeeRepositiory extends JpaRepository<Employee, Integer>{

	
	//-----------------Get One Row Data Using Positonal Parameter------------
	  @Query("select e from com.olive.model.Employee e where e.empId=?1")   
      Employee  getEmployeeById(Integer id);
	  
	  @Query("select e from com.olive.model.Employee e where e.empName=?1")   
      Employee  getEmployeeByName(String name);
	  
	  @Query("select e from com.olive.model.Employee e where e.empId=?1 And e.empName=?2 And e.empSal=?3")   
      Employee  getEmployeeByNameSal(Integer id,String name,double sal);
	  
	  @Query("select e from com.olive.model.Employee e where e.empId=?1 And e.empName=?2 or e.empSal=?3")   
      Employee  getEmployeeByIdAndNameOrSal(Integer id,String name,double sal);
	  
	  @Query("select e.empName from com.olive.model.Employee e where e.empName=?1")
	  String getEmpName(String name);
	  
	  @Query("select e.empName,e.empSal from com.olive.model.Employee e where e.empSal=?1")
	  Object getEmpNameAndSalBySal(double sal);
	  
	//---------------Get One Row Data Using Name Param---------------------
	  
	  @Query("select e from com.olive.model.Employee e where e.empId=:id")   
      Employee  getEmployeeByIdNameParam(Integer id);
	  
	  @Query("select e from com.olive.model.Employee e where e.empName=:name")   
      Employee  getEmployeeByNameNameParam(String name);
	  
	  @Query("select e from com.olive.model.Employee e where e.empId=:id And e.empName=:name And e.empSal=:sal")   
      Employee  getEmployeeByNameSalNameParam(String name,double sal,Integer id);
	  
	  @Query("select e from com.olive.model.Employee e where e.empId=:id And e.empName=:name or e.empSal=:sal")   
      Employee  getEmployeeByIdAndNameOrSalNameParam(Integer id,double sal,String name);
	  
	  @Query("select e.empName from com.olive.model.Employee e where e.empName=:name")
	  String getEmpNameNameParam(String name);
	  
	  @Query("select e.empName,e.empSal from com.olive.model.Employee e where e.empSal=:sal")
	  Object getEmpNameAndSalBySalNameParam(double sal);    
	  
	
}

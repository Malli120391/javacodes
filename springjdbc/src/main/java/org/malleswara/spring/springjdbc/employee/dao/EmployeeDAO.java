package org.malleswara.spring.springjdbc.employee.dao;

import java.util.List;

import org.malleswara.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDAO {
	
	int create(Employee employee);
	
	int update(Employee employee);
	
	int dalete(int id);
	
	Employee read(int id);
	
	List<Employee> read();

}

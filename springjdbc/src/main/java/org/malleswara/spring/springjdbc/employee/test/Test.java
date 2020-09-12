package org.malleswara.spring.springjdbc.employee.test;

import java.util.List;

import org.malleswara.spring.springjdbc.employee.dao.EmployeeDAO;
import org.malleswara.spring.springjdbc.employee.dto.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("org/malleswara/spring/springjdbc/employee/test/sjdbcconfig.xml");
		EmployeeDAO dao = (EmployeeDAO) context.getBean("employeedao");
		//Employee employee = new Employee();
		//employee.setId(1);
		//employee.setFirstname("Spring");
		//employee.setLastname("jdbc");
		//Employee employee = dao.read(2);
		//int result =dao.create(employee);
		//int result = dao.update(employee);
		//int result = dao.dalete(4);
		//System.out.println("No of records inserted:"+result);
		//System.out.println("No of records updated:"+result);
		//System.out.println("No of records deleted:"+result);
		//System.out.println("Employee record:"+employee);
		List<Employee> result = dao.read();
		System.out.println("Employee record:"+result);
	}

}

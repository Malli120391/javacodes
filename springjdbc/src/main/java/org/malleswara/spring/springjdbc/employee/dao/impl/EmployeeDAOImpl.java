package org.malleswara.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.malleswara.spring.springjdbc.employee.dao.EmployeeDAO;
import org.malleswara.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import org.malleswara.spring.springjdbc.employee.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("employeedao")
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}


	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}


	@Override
	public int create(Employee employee) {
        
		String sql = "insert into employee values(?,?,?)";
		int result = jdbctemplate.update(sql, employee.getId(), employee.getFirstname(), employee.getLastname());
		return result;
	}


	@Override
	public int update(Employee employee) {
		String sql = "update employee set firstname=?, lastname=? where id=?";
		int update = jdbctemplate.update(sql, employee.getFirstname(), employee.getLastname(), employee.getId());
		return update;
	}


	@Override
	public int dalete(int id) {
		String sql = "delete from employee where id=?";
		int delete = jdbctemplate.update(sql, id);
		return delete;
	}


	@Override
	public Employee read(int id) {
       
		String sql = "select * from employee where id=?";
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		Employee employee = jdbctemplate.queryForObject(sql, rowmapper, id);
		
		return employee;
	}


	@Override
	public List<Employee> read() {

		String sql = "select * from employee";
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		List<Employee> result = jdbctemplate.query(sql, rowmapper);
		return result;
	}


	

}

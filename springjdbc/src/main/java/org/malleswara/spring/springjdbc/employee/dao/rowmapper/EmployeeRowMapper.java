package org.malleswara.spring.springjdbc.employee.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.malleswara.spring.springjdbc.employee.dto.Employee;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setId(rs.getInt(1));
		emp.setFirstname(rs.getString(2));
		emp.setLastname(rs.getString(3));
		return emp;
	}

}

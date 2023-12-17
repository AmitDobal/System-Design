package com.designpattern.solid.singleresponsibilityprinciple.example1.good.dao;

import com.designpattern.solid.singleresponsibilityprinciple.example1.good.dbconnections.Connection;

public class EmployeeDAO {
	
	
	public void save(EmployeeDAO dao) {
		Connection connection;
		System.out.println("Employee details are saved");
	}
}

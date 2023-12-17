package com.designpattern.solid.singleresponsibilityprinciple.example1.bad;

/*
 * This class violates the Single responsibility principle:
 * 1. Different employees can lie in different tax slabs and have different way to calculate the salary
 * 2. Connection to DB required in every entity (Duplicate Code). Saving details to DB needs connection with database
 * */
public class EmployeeBad {

	private Integer id;
	private String name;
	private Double salary;
	private String connection;
	
	public Double calculateSalary() {
		//Calculate tax and return salary
		return salary;
	}
	
	public void save() {
		//Create connection to the DB and saves Employee details
	}
	
}

package com.designpattern.solid.singleresponsibilityprinciple.example1.good.salarycalculation;

import com.designpattern.solid.singleresponsibilityprinciple.example1.good.Employee;

public class DeveloperSalary implements CalculationSalary {

	@Override
	public double calculates(Employee employee) {

		System.out.println("Developer's salary calculation");
		return 0;
	}
	
}

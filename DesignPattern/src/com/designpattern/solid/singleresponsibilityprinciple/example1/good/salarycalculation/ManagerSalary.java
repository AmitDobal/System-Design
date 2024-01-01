package com.designpattern.solid.singleresponsibilityprinciple.example1.good.salarycalculation;

import com.designpattern.solid.singleresponsibilityprinciple.example1.good.Employee;

public class ManagerSalary implements CalculationSalary {

	@Override
	public double calculates(Employee employee) {

		System.out.println("Managaer's salary calculation");
		return 0;
	}
	
}

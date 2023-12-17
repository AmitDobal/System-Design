package com.designpattern.solid.singleresponsibilityprinciple.example1.good.salarycalculation;

import com.designpattern.solid.singleresponsibilityprinciple.example1.good.Employee;

public interface CalculationSalary {
	public double calculates(Employee employee);
}

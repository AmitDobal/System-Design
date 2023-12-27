package com.designpattern.solid.singleresponsibilityprinciple.example1.good;

import java.util.Objects;

import com.designpattern.solid.singleresponsibilityprinciple.example1.good.salarycalculation.CalculationSalary;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;
//	private String connection;
	private CalculationSalary calculationSalary;
	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(salary, other.salary);
	}
	
	
	
}

package com.designpattern.strategy.example2.calculator.operation;

import com.designpattern.strategy.example2.calculator.strategy.Strategy;

public class Subtraction implements Strategy{

	@Override
	public void execute(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	

}

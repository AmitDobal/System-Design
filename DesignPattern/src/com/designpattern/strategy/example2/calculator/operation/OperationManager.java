package com.designpattern.strategy.example2.calculator.operation;

import com.designpattern.strategy.example2.calculator.strategy.Strategy;

public class OperationManager {

	private Strategy strategy;

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void execute(int num1, int num2) {
		this.strategy.execute(num1, num2);
	}
}

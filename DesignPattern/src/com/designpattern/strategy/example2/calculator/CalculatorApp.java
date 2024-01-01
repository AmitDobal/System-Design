package com.designpattern.strategy.example2.calculator;

import com.designpattern.strategy.example2.calculator.operation.*;
import com.designpattern.strategy.example2.calculator.operation.OperationManager;

public class CalculatorApp {
	public static void main(String[] args) {
		OperationManager manager = new OperationManager();
		manager.setStrategy(new Multiplication());

		manager.execute(4, 5);
	}
}

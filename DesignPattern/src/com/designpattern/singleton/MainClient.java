package com.designpattern.singleton;

public class MainClient {
	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		System.out.println(divide(a, b));
	}

	public static int divide(int a, int b) {
		int c = 0;
		try {
			c = a / b;
			try {
				c = a / b;
			} catch (ArithmeticException e) {
				System.out.println("Inner ARRR: " + e.getMessage());
			} finally {
				System.out.println("Inner Finally");
			}
			System.out.println("AFtert 1s t try");
		} catch (ArithmeticException e) {
			System.out.println(" outer ARRR: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("outer EXCCCCC: " + e.getMessage());
		} finally {
			System.out.println("Outer finally block");
		}

		c = 99;
		return c;
	}
}

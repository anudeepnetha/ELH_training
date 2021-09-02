package com.service;

public class Calculatorlmpl implements Calculator {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int sub(int num1, int num2) {
		return num1  - num2;
	}

	@Override
	public int mul(int num1, int num2) {
		return num1  * num2;
	}

	@Override
	public int div(int num1, int num2) {
		int temp = 0;
		// handle the exception 
		try {
			// handle
		temp =	num1 / num2;
		} catch (java.lang.ArithmeticException ae) {
			// solution
			System.out.println("solution : " + "enter other than zero");
			
		}
		return  temp;
	}

}

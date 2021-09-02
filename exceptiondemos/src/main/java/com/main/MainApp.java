package com.main;

import com.service.Calculator;
import com.service.Calculatorlmpl;

public class MainApp {

	public static void main(String[] args) {
       Calculator calculator = new Calculatorlmpl();
       System.out.println("Addition of 2 number 2 + 3: " + calculator.add(2 , 3));
       System.out.println("subtraction of 2 number 5 - 3 : " + calculator.sub(5 , 3));
       System.out.println("multiplication of 2 number 2 x 3 : " + calculator.mul(2 , 3));
       System.out.println("division of 2 number 10/0 : " + calculator.div(10 , 0));
        // memory managment
       System.out.println(" THE END");
       calculator = null;
	}

}

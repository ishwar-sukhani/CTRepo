package com.examples.java;

public class SwapNumber {
	
	void swapNum(int num1, int num2){
		System.out.println("Numbers before Swap were");
		System.out.println("Number 1: "+num1);
		System.out.println("Number 2: "+num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Numbers before Swap are");
		System.out.println("Number 1: "+num1);
		System.out.println("Number 2: "+num2);
	}
}

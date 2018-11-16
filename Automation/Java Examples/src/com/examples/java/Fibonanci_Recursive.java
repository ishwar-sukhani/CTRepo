package com.examples.java;

import java.util.Scanner;

public class Fibonanci_Recursive {
	
	int num1 = 0, num2 = 1, num3 = 0;
	
	void printFibo(int c){
		num3 = num1 + num2;
		num1 = num2;
		num2 = num3;
		if(c > 0){
			System.out.print(num3+" ");
			c = c-1;
			printFibo(c);
		}
	}
	
	void printFibo1(int c){
		if(c > 0){
			System.out.print(num3+" ");
			c = c-1;
			printFibo(c);
		}
	}
	
	int acceptFiboCount(){
		int count;
		Scanner scr =  new Scanner(System.in);
		System.out.print("Enter the count till which Fibonanci series is to be printed: ");
		count = scr.nextInt();
		scr.close();
		return count;
	}
}

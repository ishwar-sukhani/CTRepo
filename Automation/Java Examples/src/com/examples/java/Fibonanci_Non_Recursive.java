package com.examples.java;

import java.util.Scanner;

public class Fibonanci_Non_Recursive {

		int num1 = 0, num2 = 1, num3 = 0;
		int fiboLimit;
		
		void printFibo(){
			if(num1 == 0 && num2 == 1)
				System.out.print(num1+" "+num2+" ");
			for (int i = 0; i < fiboLimit-2; i++) {
				num3 = num1 + num2;
				System.out.print(num3+" ");
				num1 = num2;
				num2 = num3;
			}
		}
		
		void acceptFiboLimit(){
			Scanner scr = new Scanner(System.in);
			System.out.print("Enter limit for printing fibonanci series: ");
			fiboLimit = scr.nextInt();
			scr.close();
		}
}

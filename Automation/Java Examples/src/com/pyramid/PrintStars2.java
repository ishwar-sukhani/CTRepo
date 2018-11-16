package com.pyramid;

import java.util.Scanner;

public class PrintStars2 {
	public static void main(String[] args) {
		int n = 0;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Number of Star Lines to be Printed: ");
		n = scr.nextInt();
		for (int i = 1; i <= n; i++) {
			
			for (int j = n-1; j >= i ; j--) {
				System.out.print(" ");
			}			
			
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int x = 1; x <= (n*2)-1; x++) {
			
			for (int y = 1; y <= x ; y++) {
				System.out.print(" ");
			}			
			
			for (int z = n-x; z >= 1; z--) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
	}

}

/*

    * 
   * * 
  * * * 
 * * * * 
* * * * *
 * * * *
  * * *
   * *
    * 

*/
package com.pyramid;

public class PrintStars {

	public static void main(String[] args) {
		int n = 5;
		
		for (int i = 1; i <= n; i++) {
			for (int j = n-1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

/*
i,j	0 1	2 3	 k  
0	      *	 0
1		* *
2	  * * *
3	* * * *
*/
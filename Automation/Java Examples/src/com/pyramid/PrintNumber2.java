package com.pyramid;

public class PrintNumber2 {

	public static void main(String[] args) {
		int user_input = 6;
		for (int i = 1; i <= user_input; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}

/*
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5
6 6 6 6 6 6
*/
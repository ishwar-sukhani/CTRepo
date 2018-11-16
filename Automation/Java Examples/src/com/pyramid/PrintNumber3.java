package com.pyramid;

public class PrintNumber3 {
	static int count = 0;
	
	public static void main(String[] args) {
		int n = 4;
		int arr[][] = new int[(n*2)-1][(n*2)-1];
		int a[],b;
		int []c,d;

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				if(count == 0 || count == 6){
					arr[row][col] = n;
					arr[col][row] = n;
				}
				else if(count == 1 || count == 5) {
					arr[row][col] = n-1;
					arr[col][row] = n-1;
				}
				
				System.out.print(arr[row][col]+" ");
			}
			count = count + 1;
			System.out.println();
		}
		
	}
}

/* Output should be

4  4  4  4  4  4  4
4  3  3  3  3  3  4
4  3  2  2  2  3  4
4  3  2  1  2  3  4
4  3  2  2  2  3  4
4  3  3  3  3  3  4
4  4  4  4  4  4  4

*/
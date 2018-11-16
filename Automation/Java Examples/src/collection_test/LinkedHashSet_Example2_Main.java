package collection_test;

import java.util.Scanner;

public class LinkedHashSet_Example2_Main {

	public static void main(String[] args) {
		LinkedHashSet_Example2 obj = new LinkedHashSet_Example2();
		String arr[] = new String[4];
		Scanner scr = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter "+(i+1)+ " element of Hash Set: ");
			arr[i] = scr.nextLine();
		}
		scr.close();
		
		obj.addToLinkedHashSet(arr);
		obj.displayLinkedHashSet();
	}
}

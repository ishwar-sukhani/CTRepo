package collection_test;

import java.util.Scanner;

public class LinkedHashSet_Example1_Main {

	public static void main(String[] args) {
		LinkedHashSet_Example1 obj = new LinkedHashSet_Example1();
		char arr[] = new char[4];
		Scanner scr = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter "+(i+1)+" element in Collection: ");
			arr[i] = scr.next().charAt(0);
		}
		scr.close();
		
		obj.addToLinkedHashSet(arr);
		obj.displayLinkedHashSet();
	}
}

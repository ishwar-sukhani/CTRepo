package collection_test;

import java.util.Scanner;

public class HashSet_Example1_Main {

	public static void main(String[] args) {
		HashSet_Example1 obj = new HashSet_Example1();
		String arr[] = new String[4];
		Scanner scr = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter "+(i+1)+ " element of Hash Set: ");
			arr[i] = scr.nextLine();
		}
		scr.close();
		obj.addToHashSet(arr);
		obj.displayHashSet();
/*		obj.removeFromHashSet("Sanyo");
		System.out.println("\n");
		obj.displayHashSet();*/
	}

}

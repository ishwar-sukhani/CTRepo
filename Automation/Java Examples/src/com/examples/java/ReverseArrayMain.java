package com.examples.java;

import java.util.Scanner;

public class ReverseArrayMain {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		//ReverseArray obj = new ReverseArray();
		ArrayDup obj1 = new ArrayDup();
		System.out.print("Enter size if array : ");
		int arrSize = scr.nextInt();
		System.out.println("Enter elements of array : ");
		int[] arr = new int[arrSize];
		for(int i=0;i<arrSize;i++){
			System.out.print("Enter "+(i+1)+" element of array : ");
			arr[i] = scr.nextInt();
		}
		scr.close();
		//obj.reverse(arr);
		obj1.findDuplicatesInArray(arr);
	}
}

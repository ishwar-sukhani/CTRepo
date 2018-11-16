package com.examples.java;

public class ReverseArray {
	
	public void reverse(int arr[]){
		System.out.println("\n");
		for(int p=0;p<arr.length;p++)
			System.out.println("Array entered is : "+arr[p]);
		
		System.out.println("\n");
		for(int i=arr.length-1;i>=0;i--){
			int a = arr[i];
			System.out.println("Reversed Array is : "+a);
		}
	}
}

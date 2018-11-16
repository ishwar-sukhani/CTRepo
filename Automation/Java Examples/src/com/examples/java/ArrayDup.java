package com.examples.java;

public class ArrayDup {
	public void findDuplicatesInArray(int arr[]){
		System.out.println("\nInput Array Received");
		for(int p=0;p<arr.length;p++)
			System.out.print(arr[p]+" ");
		System.out.println();
		
		int count=0;
		for(int i=0;i<arr.length;i++){
			for (int j=0;j<arr.length;j++) {
				if(i!=j	&& arr[i]==arr[j]){
					count = count + 1;
					continue;
				}
				if(count>0){
					System.out.println(arr[i]);
					count=0;
				}
			}		
		}
	}
}

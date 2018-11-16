package com.examples.java;

public class MinMaxFromArray {
	
	int min, max;
	
	public int findMin(int arr[]){
		min = arr[0];
		for(int i=0; i<arr.length; i++){
			if(min > arr[i]){
				min = arr[i];
			}
		}
		return min;
	}
	
	public int findMax(int arr[]){
		max = arr[arr.length -1];
		for(int i=0; i<arr.length; i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] arr = {5777,4,2,80,999,1};
		MinMaxFromArray obj = new MinMaxFromArray();
		System.out.println("MIN = "+obj.findMin(arr));
		System.out.println("MAX = "+obj.findMax(arr));
	}

}
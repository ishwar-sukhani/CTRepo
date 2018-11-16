package com.examples.java;

public class StringOperations {

	protected void reverseString(String original){
		
		String reversed="";
		for(int i=original.length()-1;i>=0;i--){
				reversed = reversed+original.charAt(i);
		}
		System.out.println(reversed);
	}
	
	protected void palindromeStringCheck(String original){
		
		String reversed="";
		for(int i=original.length()-1;i>=0;i--){
				reversed = reversed+original.charAt(i);
		}
		if(original.equalsIgnoreCase(reversed))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is NOT Palindrome");
	}
}

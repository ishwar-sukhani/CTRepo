package com.examples.java;

import java.util.Scanner;

public class InputAcceptor {
	
	Scanner scr = new Scanner(System.in);
	StringOperations obj;
	
	public String receiveAndSendInput(int input){
		
		System.out.println("What String operations you would like to perform ?");
		System.out.println("1. Reverse String \n2. Check String for Palindrome");
		System.out.println("Select your operation by pressing numbers key");
		input = scr.nextInt(); 
		
		switch (input) {
		case 1:
			System.out.println("Enter the String to be Reversed");
			String strToBeRev = scr.next();
			return strToBeRev;

		case 2:
			System.out.println("Enter the String to be checked for Palindrome");
			String strForPalindromeChk = scr.next();
			return strForPalindromeChk;

		default:
			scr.close();
			return "Input seems to be invalid";
		}
	}
}

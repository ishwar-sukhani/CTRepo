package com.examples.java;

public class Main {

	public static void main(String[] args) {
		
		StringOperations obj;
		InputAcceptor in = new InputAcceptor();
		
		String receivedInputStr = in.receiveAndSendInput(2);

		obj = new StringOperations();
		obj.palindromeStringCheck(receivedInputStr);
			
		/*obj = new StringOperations();
		obj.palindromeStringCheck(receivedInputStr);*/
		
	}
}

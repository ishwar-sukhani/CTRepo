package exceptions;

import java.io.IOException;
import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) //throws ArithmeticException{ 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount..");
		int amount = sc.nextInt();
		 
		Account  ob = new Account();
		 
		try {
			ob.openAccount(amount);
		} catch (LowBalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		ob.showBal();
		System.out.println("another module");

	}

}

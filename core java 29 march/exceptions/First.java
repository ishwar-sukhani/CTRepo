package exceptions;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();		
		try{ 
		int c = a/b;
		System.out.println(c);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
			
		}
		finally {		 
		sc.close();
		}
		 

 	}

}

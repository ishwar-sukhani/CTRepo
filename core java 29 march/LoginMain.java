package jdbc_test;

import java.util.Scanner;

public class LoginMain {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ID");
		int id=sc.nextInt();
		System.out.println("Enter the NAME");
		String name=sc.next();
		if(new LoginTest().login(id, name))
		{
			System.out.println("welcome");
		}
		else
		{
			System.out.println("u r not a auth user");
		}

	}

}

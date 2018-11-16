package com.test;

public class StaticVariable {

	static int x;
	int y;
	
	public static void main(String[] args) {
		StaticVariable s1 = new StaticVariable();
		s1.x = 10;
		s1.y = 20;
		
		StaticVariable s2 = new StaticVariable();
		s2.x = 30;
		s2.y = 40;
		
		System.out.println(x);
		System.out.println(y);
	}

}

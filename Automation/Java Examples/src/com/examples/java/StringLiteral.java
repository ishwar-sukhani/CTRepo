package com.examples.java;

public class StringLiteral {

	public static void main(String[] args) {
		String s = "Ishwar";
		String s1 = "ishwar";
		if(s == s1){
			System.out.println("True. Hashcode of both strings are = "+s.hashCode()+" , "+s1.hashCode());
		}
		else{
			System.out.println("False. Hashcode of both strings are = "+s.hashCode()+" , "+s1.hashCode());
		}
		
		if(s.equals(s1)){
			System.out.println("True. Hashcode of both strings are = "+s.hashCode()+" , "+s1.hashCode());
		}
		else{
			System.out.println("False. Hashcode of both strings are = "+s.hashCode()+" , "+s1.hashCode());
		}
		
	}

}

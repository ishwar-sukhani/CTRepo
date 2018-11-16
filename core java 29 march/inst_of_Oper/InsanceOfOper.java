package inst_of_Oper;

import java.util.Scanner;


class Abc{}
public class InsanceOfOper {

	public static void main(String[] args) {
		
		String s="Citi"; 
		
		if(s instanceof String)			
			System.out.println("instance of String ..");		
		if(s instanceof Object)			
			System.out.println("Instance of object too ..");
		
		
		Abc ob=new Abc(); 		
		if(ob instanceof Abc)			
			System.out.println("Instance of Abc");		
	 
		
		if(ob instanceof Object)			
			System.out.println("Instance of object too ..");
		
		
		Abc ref=null; 		
		if(ref instanceof Abc)			
			System.out.println("Instance of Abc");		
		else
			System.out.println("Not Initi.....");
		
	}
}

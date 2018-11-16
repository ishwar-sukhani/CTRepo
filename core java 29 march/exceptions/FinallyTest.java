package exceptions;

import java.util.Scanner;

public class FinallyTest { 
	   public static void main(String args[])
	     {	 
	     try						
			 {	 
				 int c =10/0;	 
			 }
	      catch(ArithmeticException ae)
	         { 
	    	  System.out.println("Message");
	    	  System.out.println(ae);
	    	 }
	      catch(ArrayIndexOutOfBoundsException ae)
	         {              					
	           System.out.println(ae); 
	         }
	     
	       finally 
	            { 
	    	      System.out.println("  From finally  ");
	            }	   
	     
	     System.out.println("Module 2");
	     
	     }

}

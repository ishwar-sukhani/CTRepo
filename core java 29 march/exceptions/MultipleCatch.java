package exceptions;

public class MultipleCatch { 
	   public static void main(String args[])  
	     {	
		   try{
		    int a=args.length;	
		    System.out.println("arrary length is : " + a);			
	        int b=12/a;
		   }
		   catch (ArithmeticException e) {
				System.out.println(e);
			}
		   try{
			int c[]= new int[3];
            c[12]=23;
		   }
		   catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	        
            
            System.out.println("After catch");
	    }
	}	


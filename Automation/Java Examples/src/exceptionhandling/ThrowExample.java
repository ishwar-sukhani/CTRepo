package exceptionhandling;

public class ThrowExample {
	
	static String str = "";
	
	static void modify(){
		str = "Ishwar";
	}
	
	
	public static void main(String[] args) {
		ThrowExample.str = null;
		//ThrowExample.modify();
		System.out.println(ThrowExample.str);
		/*
		if(str == null)
			throw new NullPointerException("String is NULL");
		*/
		try {
			System.out.println("Inside TRY");
			if(str == null)
				throw new NullPointerException("String is NULL");
		} 
		catch (NullPointerException e) {
			System.out.println("Inside CATCH "+ e);
		}
		
		System.out.println("Statements after TRY..CATCH");
	}
	
}

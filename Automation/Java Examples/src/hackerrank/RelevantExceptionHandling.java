package hackerrank;

public class RelevantExceptionHandling {

	public static void main(String[] args) {
		int arr[] = new int[5];
		try{
			arr[5] = 5/0;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("I am in Array Index Out of Bounds Exception ...");
		}
		
		catch(ArithmeticException e){
			System.out.println("I am in Arithmetic Exception ...");
		}
		
		catch(Exception e){
			System.out.println("I am in Exeption ...");
		}
		System.out.println("rest of the code");
	}

}

package exceptionhandling;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		int sum = 10;
		try {
			for(int i = -1;i < 3; ++i){
				System.out.println("i = "+i);
				sum = (sum / i);
				System.out.println("sum = "+sum);
			}
		} catch (Exception e) {
			System.out.println("0");
		}
		System.out.println("sum = "+sum);
	}

}

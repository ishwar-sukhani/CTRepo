package hackerrank;

import java.util.Scanner;

public class StdInAndStdOut {

	public static void main(String[] args) {
		int i = 0;
		double d = 0.0;
		String s = "";
		int j = 0;
		Scanner scan = new Scanner(System.in);
		while(j != 3){
			if(scan.hasNextInt())
//				int i = scan.nextInt();
				i = scan.nextInt();
			else if(scan.hasNextFloat())
//				double d = scan.nextDouble();
				d = scan.nextDouble();
			else
//				String s = scan.nextLine();
				s = scan.nextLine();
			
			j++;
		}
		

	        // Write your code here.

	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	        
	        scan.close();
	    }
}

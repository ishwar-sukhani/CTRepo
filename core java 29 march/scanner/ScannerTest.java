package scanner;

import java.util.*;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter string..");
		String msg = sc.next();
		System.out.println("Hello  "+msg);
		
		System.out.println("Enter number ...");
		int number = sc.nextInt();
		System.out.println("NUmber  "+number);
		
	}
}

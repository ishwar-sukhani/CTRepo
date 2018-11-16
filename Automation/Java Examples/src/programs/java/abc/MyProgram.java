package programs.java.abc;
import java.util.*;

public class MyProgram {

      public static void main(String[] args) {
    	    //System.out.println("Enter Name");
            Scanner abc = new Scanner(System.in);
            String User_txt =  abc.next();
            System.out.println("my name is anand"+User_txt);
            abc.close();
            System.out.println("Success");
      }
      
}

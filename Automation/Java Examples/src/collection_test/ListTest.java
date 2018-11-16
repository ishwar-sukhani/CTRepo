package collection_test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListTest {

	public static void main(String[] args) {  
		
		ArrayList  al=new ArrayList();//creating arraylist    
		  al.add("Ravi");//adding object in arraylist    
		  al.add("Vijay");    
		  al.add("Ravi");    
		  al.add("Ajay");    
		  System.out.println("arraylist: "+al); 
		  Iterator i = al.iterator();
		 
		  /* while(i.hasNext())
		  {
			   
		  }*/
		   
		    
		  LinkedList ll=new LinkedList();//creating linkedlist    
		  ll.add("James");//adding object in linkedlist    
		  ll.add("Serena");    
		  ll.add("Swati");    
		  ll.add("Junaid");    
		  System.out.println("linkedlist: "+ll);  
		 }    
		
		
 
}

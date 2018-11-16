package collection_test;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) { 
		
		HashMap cache = new HashMap(); 
		cache.put(1, "Stuart"); 
		cache.put(2, "Steven");
		cache.put(3, "James"); 
		cache.put(4, "Ian"); 
		System.out.println("Name of Employee with id  1 "+cache.get(1));
		System.out.println("Order of Entries in HashMap - Not guaranteed"); 
		System.out.println(cache); 
		
		
		LinkedHashMap cache1 = new LinkedHashMap(); 
		cache1.put(2, "Steven");
		cache1.put(3, "James"); 
		cache1.put(1, "Stuart"); 		
		cache1.put(4, "Ian");  
		System.out.println("Order of Entries in LinkedHashMap -guaranteed");
		System.out.println(cache1); 
		
		TreeMap cache2 = new TreeMap(); 
		cache2.put(2, "Steven");
		cache2.put(3, "James"); 
		cache2.put(1, "Stuart"); 		
		cache2.put(4, "Ian");  
		System.out.println("Entries in TreeMap -sorted");
		System.out.println(cache2); 
		
	}

}

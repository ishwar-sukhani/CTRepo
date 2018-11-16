package collection_test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Null_Duplicate_Values {

	public static void main(String[] args) {
		// List - Allow Multiple NULL Values and Duplicates
		ArrayList<Integer> arraylist = new ArrayList<>();
		LinkedList<Integer> linklist = new LinkedList<>();
		
		// Set - Allow ONLY ONE (HashSet,LinkedHashSet) or NO NULL (TreeSet) Values and Duplicates
		HashSet<Integer> hashset = new HashSet<>();
		LinkedHashSet<Integer> linkhashset = new LinkedHashSet<>();
		TreeSet<Integer> treeset = new TreeSet<>();
		
		// Add to ArrayList
		arraylist.add(10);
		arraylist.add(null);
		arraylist.add(null);
		arraylist.add(20);
		arraylist.add(20); // Duplicate
		System.out.println(arraylist);
		
		// Add to LinkedList
		
		linklist.add(30);
		linklist.add(40);
		linklist.add(null);
		linklist.add(null);
		linklist.add(40); // Duplicate
		System.out.println(linklist);
	
		// Add to HashSet
		hashset.add(null);
		hashset.add(null);
		hashset.add(50);
		hashset.add(60);
		hashset.add(60); // Duplicate
		System.out.println(hashset);
		
		// Add to LinkedHashSet
		linkhashset.add(null);
		linkhashset.add(70);
		linkhashset.add(80);
		linkhashset.add(null);
		linkhashset.add(80); // Duplicate
		System.out.println(linkhashset);
		
		// Add to TreeSet
		//treeset.add(null); -> Will throw Exception
		treeset.add(90);
		//treeset.add(null);
		treeset.add(100);
		treeset.add(100); // Duplicate
		System.out.println(treeset);
		
	}
}

package collection_test;

import java.util.ArrayList;

public class ArrayList_Example1 {
	
	ArrayList<Integer> al1 = new ArrayList<Integer>();
	ArrayList<Integer> al2 = new ArrayList<Integer>();
	public void addToArrayList(){
		al1.add(6);
		al1.add(2);
		al1.add(2);
		al1.add(null);
		al1.add(null);
		
		al2.add(3);
		al2.add(4);
		al2.add(5);
		
		//System.out.println("GET METHOD CALLED "+al1.get(0));
	}
	
	public void removeAllFromArrayList(){
		al1.removeAll(al2);
	}
	
	public void displayArrayList(){
		System.out.println("ArrayList 1:" +al1);
		System.out.println("ArrayList 2:" +al2);
	}
	
	public void retainAllFromArrayList(){
		al1.retainAll(al2);
	}
}

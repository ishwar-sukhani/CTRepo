package collection_test;

import java.util.LinkedList;

public class LinkList_Example1 {
	LinkedList<String> l1 = new LinkedList<String>();
	
	public void addToList(){
		l1.add("Vibhav");
		l1.add("Ishwar");
		l1.add("Meena");
		l1.add("Anand");
	}
	
	public void addAtFirst(){
		l1.addFirst("Ahmad");
	}
	
	public void addAtLast(){
		l1.addLast("Sanyogeeta");
	}
	
	public void displayFirst(){
		String s = l1.getFirst();
		System.out.println("First Element :"+s);
	}
	
	public void displayLast(){
		String s = l1.getLast();
		System.out.println("Last Element :"+s);
	}
	
	public void diplayLinkedList(){
		System.out.println("Linked List 1: "+l1);
	}
}

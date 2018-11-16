package collection_test;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_Example {
	public static void main(String args[]){
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(113423);
		list.add(12498);
		list.add(131);
		
		System.out.println("NEW: "+list);
		System.out.println("TOTAL ELEMENTS: "+list.size());
		
		list.add(0, 9);
		
		System.out.println("FIRST MODIFICATION: "+list);
		System.out.println("TOTAL ELEMENTS: "+list.size());
		
		List<Integer> list2 = new LinkedList<Integer>();
		list2.add(88);
		list2.add(89);
		
		list.addAll(list.indexOf(list.getLast()), list2);
		
		System.out.println("FINAL: "+list);
		System.out.println("TOTAL ELEMENTS: "+list.size());
		
		ListIterator<Integer> itr = list.listIterator();
		
		System.out.println("\n LIST IN INSERTION ORDER");
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		System.out.println("\n LIST IN REVERSE ORDER");
		while(itr.hasPrevious()){
			System.out.print(itr.previous()+" ");
		}
	}
	
}
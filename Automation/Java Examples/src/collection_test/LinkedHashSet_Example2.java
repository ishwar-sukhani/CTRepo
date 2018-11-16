package collection_test;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_Example2 {

	LinkedHashSet<String> lhs = new LinkedHashSet<>();
	
	void addToLinkedHashSet(String arr[]){
		for(String s:arr){
			lhs.add(s);
		}
	}
	
	void removeFromLinkedHashSet(String str){
		lhs.remove(str);
	}
	
	void displayLinkedHashSet(){
//			System.out.println(lhs);
		/*Iterator<String> itr = lhs.iterator();
		while(itr.hasNext()){
			if(itr.next() == null)
				System.out.println("NULL VALUE");
			else
				System.out.println(itr.next());
		}*/

		for(String str:lhs){
			if(str.isEmpty())
				System.out.println("NULL VALUE");
			else
				System.out.println(str);
		}
	}
}

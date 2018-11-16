package collection_test;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Example1 {

	HashSet<String> hs = new HashSet<>();
	
	void addToHashSet(String arr[]){
		for(String str:arr){
			hs.add(str);
		}
	}
	
	void removeFromHashSet(String s){
		hs.remove(s);
	}
	
	void displayHashSet(){
		System.out.println(hs);
		/*Iterator<String> itr = hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
	}
}

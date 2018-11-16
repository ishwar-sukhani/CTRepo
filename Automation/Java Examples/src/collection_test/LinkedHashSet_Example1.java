package collection_test;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_Example1 {
	Set<Character> set = new LinkedHashSet<Character>();
	//LinkedHashSet<Character> lhs = new LinkedHashSet<>();
	
	void addToLinkedHashSet(char arr[]){
		for(char c:arr){
			set.add(c);
		}
	}
	
	void removeFromLinkedHashSet(Character c){
		set.remove(c);
	}
	
	void displayLinkedHashSet(){
		System.out.println(set);
	}
}

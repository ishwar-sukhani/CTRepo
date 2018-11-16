package collection_test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkList_Example2_Main {

	public static void main(String[] args) {
		LinkedList<LinkList_Example2> list = new LinkedList<LinkList_Example2>();
		LinkList_Example2 obj1 = new LinkList_Example2(22, "Yeshwant Kanetkar", "Let Us C");
		LinkList_Example2 obj2 = new LinkList_Example2(89, "Swapnil Godke", "Master Selenium");
		LinkList_Example2 obj3 = new LinkList_Example2(70, "Urvashi Dholakia", "Live Life at Fullest");
		
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		
		// Option 1 to traverse
		for(LinkList_Example2 element:list){
			System.out.println(element.id+", "+element.author+", "+element.title);
		}
		
		/*LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(2);*/
		Iterator<LinkList_Example2> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}

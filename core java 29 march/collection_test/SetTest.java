package collection_test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) { 
		
		HashSet hs=new HashSet();		
		hs.add(23);
		hs.add(10);
		hs.add(55); 
		Iterator hsi=hs.iterator();
		while(hsi.hasNext())
		{
			System.out.println(hsi.next()); 
		}		
		
		System.out.println("HASH SET :"+hs); 
		
		LinkedHashSet  lhs=new LinkedHashSet();
		lhs.add(23);
		lhs.add(10);
		lhs.add(55); 
		Iterator lhsi=lhs.iterator();
		while(lhsi.hasNext())
		{
			System.out.println(lhsi.next());
		}
		System.out.println("Linked HashSet  :"+lhs); 

		
		TreeSet  ts=new TreeSet();
		ts.add(23);
		ts.add(10);
		ts.add(55); 
		Iterator tsi=ts.iterator();
		while(tsi.hasNext())
		{
			System.out.println(tsi.next());
		}
		//SortedSet f =ts.headSet(2);
		System.out.println("Tree Set  :"+ts);
		System.out.println("Tree Set  :"+ts.headSet(24));
		System.out.println("Tree Set  :"+ts.headSet(11));

	}

}

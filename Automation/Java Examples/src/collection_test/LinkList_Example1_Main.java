package collection_test;

public class LinkList_Example1_Main {

	public static void main(String[] args) {
		LinkList_Example1 obj = new LinkList_Example1();
		obj.addToList();
		obj.diplayLinkedList();
		obj.displayFirst();
		obj.displayLast();
		System.out.println();
		
		obj.addAtFirst();
		obj.diplayLinkedList();
		obj.displayFirst();
		obj.displayLast();
		System.out.println();
		
		obj.addAtLast();
		obj.diplayLinkedList();
		obj.displayFirst();
		obj.displayLast();
	}

}

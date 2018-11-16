package collection_test;

public class ArrayList_Example1_Main {

	public static void main(String[] args) {
		ArrayList_Example1 obj = new ArrayList_Example1();
		obj.addToArrayList();
		System.out.println("As added by User");
		obj.displayArrayList();
		obj.retainAllFromArrayList();
		System.out.println("Retained Arraylist");
		obj.displayArrayList();
		obj.removeAllFromArrayList();
		System.out.println("Removed Arraylist");
		obj.displayArrayList();
	}
}

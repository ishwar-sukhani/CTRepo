package interface_test;

public interface ExampleInterface {
	
	void X();
	
	void Y();
	
	default void Z(){
		int count=0;
		System.out.println("Count = "+count);
	}
}

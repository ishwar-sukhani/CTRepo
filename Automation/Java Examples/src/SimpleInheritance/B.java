package SimpleInheritance;

public class B extends A {
	B(){
		System.out.println("B");
	}
	
	@Override
	public String toString() {
		return "toString Overriden in Class B";
	}
	
}

package tostring;

public class Student {

	
	 int rollnumber;
	 String name;
	 int age;
	 
	public Student(int rollnumber, String name, int age) {
		this.rollnumber = rollnumber;
		this.name = name;
		this.age = age;
	}
	
	
	public String toString(){
		return "roll number :"+rollnumber +"Name :"+name +"Age :"+age;
	}
	
	
	
	
	
	
}

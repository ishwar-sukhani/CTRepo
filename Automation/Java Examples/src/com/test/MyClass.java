package com.test;

public abstract class MyClass extends Thread
{
	public MyClass(String s)
	 { 
		msg = s;
	 }
	String msg;
	public void run()
	 {
	System.out.println(msg);
	}
	
	/*	abstract void final method1();
	
public static void main(String[] args)
{
	new MyClass("Hello");
	new MyClass("World");
}*/
}

/*package com.test;

public class MyClass
{ 
public static void main(String argv[]){ 
int array[]=new int[5];
System.out.println(array[0]); 
String a = "ABCD";
a.concat("DEF");
System.out.println(a);
} 
}*/
class Example{

public static void test(String str){
	System.out.println("Hi Str");
}

public static void test(Object obj){
	System.out.println("Hello Obj");
}

public static void main(String args[]){
	test(null);
}
}

/* This program will print Hi Str on the console. This is because JVM will search for most specific function which test(String str) here*/
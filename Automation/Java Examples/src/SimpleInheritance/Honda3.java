package SimpleInheritance;

class Bike{
	  int speedlimit=90;
	  
	  void run(){
		System.out.println("Bike is Running");  
	  }
	  
}

class Honda3 extends Bike{
	  int speedlimit=150;
	  
	  void run(){
		System.out.println("Honda bike is Running");  
	  }
	  
	  void method1(){
		  System.out.println("This is method 1");
	  }
	 
	  public static void main(String args[]){
	   Bike obj = new Honda3(); // Up-cast
	   obj.run();
	   //obj.method1();
	   System.out.println("Speedlimit is "+obj.speedlimit);
}
}

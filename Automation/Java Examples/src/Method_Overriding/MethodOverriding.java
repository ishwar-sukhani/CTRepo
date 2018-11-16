package Method_Overriding; 

 class Animal 
 {
	 Animal() 
	 		{ System.out.println("A new animal has been created!");}
	 void sleep() 
	 		{ System.out.println("An animal sleeps...");}
	 void eat()
	 		{ System.out.println("An animal eats...");}
 }	     
class Bird extends Animal
{
	Bird()
		{ System.out.println("A new bird has been created");}
	 void sleep() 
		{ System.out.println("A bird sleeps...");}
	 void eat()
		{ System.out.println("A bird eats...");}
}
public class MethodOverriding { 
	public static void main(String[] args) {	
	 
	Animal a=new Animal();
	a.eat();
	a.sleep();
	Bird b=new Bird();
	b.eat();
	b.sleep();
   
	}
}

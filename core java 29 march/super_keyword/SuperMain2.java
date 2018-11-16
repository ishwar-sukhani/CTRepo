package super_keyword;

class C11 {
	
	int a=10,b=20;
	
}
 class C22 extends C11{ 
	int a=30,b=40;
	
	void show(){ 
		System.out.println("a and b  from C11 = "+super.a+" "+super.b);
		 System.out.println("a and b  from C22 = "+a+" "+b);
	}
}
public class SuperMain2
	{
		public static void main(String[] args) {
			C22 ob=new C22(); 
			 ob.show();
		}	
	}
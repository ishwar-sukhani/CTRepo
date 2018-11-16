package super_keyword;

class C11 {
	
	int a=0,b=0;
	
	C11() {
		a=50;
		b=60;
	}
	
}


 class C22 extends C11 { 
	int a=30,b=40;
	
	C22() {
		super();
	}
	
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
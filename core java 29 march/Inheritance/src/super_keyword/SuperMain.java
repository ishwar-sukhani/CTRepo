package super_keyword;

class C1 {
	
	int a=10,b=20;
	void showC1(){
		System.out.println("a and b  from C1 = "+a+" "+b);
	}
	
}
 class C2 extends C1{ 
	int p=30,q=40;
	
	void showC2(){  
		System.out.println("p and q  from C2 = "+p+" "+q);
	}
}
public class SuperMain
	{
		public static void main(String[] args) {
			C2 ob=new C2();
			ob.showC2();
		}	
	}
package StaticTest; 

public class MainTestAcc {

	public static void main(String[] args) { 
		 
//		Account admin=new Account();
//		admin.i_rate=12;
		
		Account.i_rate=11;
		
		
		Account ob=new Account();
		ob.p_amount=12000;
		ob.duration=12; 
		ob.emi();
		
		
		Account ob1=new Account();
		ob1.p_amount=12220;
		ob1.duration=11; 
		ob1.emi();
		
		Account ob3=new Account();
		ob3.p_amount=12000;
		ob3.duration=12; 
		ob3.emi();
		
	}

}

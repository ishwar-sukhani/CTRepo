package acc;

public class AccoutMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account  atm1 = new Account();
		atm1.ac_bal=1000;
		atm1.name="herry";	

		atm1.showBal();
		atm1.showName();
		
		Account  atm2;	 
		 
		atm2= atm1;		
		
		atm2.showBal();
		atm2.showName();
		
		atm1=null;
		
		atm1.showName();

	}

}

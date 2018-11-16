package abstract_test;

abstract class Salary {
	
	int data;
	
	protected Salary() {
		System.out.println("Contructor in Abstract Class");
	}
	
	abstract int readBio();	
	abstract int totalAmount();
	abstract String generatePDF();
	
	void openDbConn(){
		System.out.println("Getting DB Connection..........");
	}
	
}

 abstract class NumberOFDay extends Salary
{
	int readBio()
	{
		openDbConn();
		System.out.println("gettting biometrics data......");
		int days=23;
		return days;
	}
} 
 
 abstract class AmountCalc extends NumberOFDay
 {
 	int totalAmount()
 	{
 		openDbConn();
 		int salaryPerDay=500;
 		System.out.println("calculating amount.....");
 		return readBio()*salaryPerDay;
 	}
 } 
 

class PDF extends AmountCalc
	{
		String generatePDF()
		{
			openDbConn();
			System.out.println("Genrating PDF........");
			return  "Salary :"+ totalAmount(); 
		}
}
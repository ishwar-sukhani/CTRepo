package exceptions;
 
public class Account {
	
	int bal;
	void openAccount(int bal) throws LowBalException
	{
		if(bal<1000)
		{
		//System.out.println("less than 1000 i not allowed");	 
	    throw  new LowBalException();
		}
		
		else{
			this.bal=bal;
		}
	}
	
	void showBal(){
		System.out.println("your bal is ="+ bal);
	}
	
}

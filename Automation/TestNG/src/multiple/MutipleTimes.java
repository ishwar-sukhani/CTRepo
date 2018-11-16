package multiple;

import org.testng.annotations.Test;

public class MutipleTimes {
	
	@Test(invocationCount = 10, timeOut = 10000) 
	public void runThisMultipleTimes(){
		System.out.println("Test Method with Invocation Count..  This will run multiple times automatically");
	}
	

}

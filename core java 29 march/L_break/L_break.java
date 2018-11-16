package L_break;

public class L_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		d: for (int i = 0; i <5; i++) { 
			s:for (int j = 0; j < 5; j++) {	 
				     for (int k = 0;k< 5;k++) {					
								
								if(k>2) 						
									continue s; 
								System.out.println("I:"+i+",J:"+j+",K:"+k);
					
				}
				
			}
			
		}
		
		
		
		
	}

}

package static_init_block;

public class StInitMain {

	public static void main(String[] args) {

	 System.out.println(StaticInit.static_data);
	 
	 StaticInit  ob = new StaticInit();
	 System.out.println(ob.non_static_data);
		
	}

}

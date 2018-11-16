package acc;

public class VarArgsTest {

	
	/*void show1(int data,String msg){
		System.out.println(data);
		System.out.println(msg);
	}
	
	void show2(int data,String msg[]){
		System.out.println(data);
		System.out.println(msg);
		System.out.println(msg2);
	}*/
	
	void show3(int data,String...locations){
		System.out.println(data);
		for(String l:locations){
			System.out.println(l);
		}
		
	}
}

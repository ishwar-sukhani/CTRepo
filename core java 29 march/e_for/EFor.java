package e_for;

public class EFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[] ={1,2,3,4,5,6};
		
		for(int i=0;i<=5;i++)
		{
			System.out.println(ar[i]);
		}
		for(int j=0;j<ar.length;j++)
		{
			System.out.println(ar[j]);
		}
		
		for(int i:ar)
		{
			System.out.println(i);
		}

	}

}

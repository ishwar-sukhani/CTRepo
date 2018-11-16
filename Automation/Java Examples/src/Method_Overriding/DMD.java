package Method_Overriding;

class Aa 
	 {
	   void call() { System.out.println("inside A");}
	 }
class Bb extends Aa
	 {
	   void call() { System.out.println("inside B"); }
	 }
class Cc extends Bb
	 {
	   void call() { System.out.println("inside C");  }
	 }

public class DMD {
	public static void main(String s[])
    {
       Aa  r;
       r =new Aa();
       r.call();
       r=new Bb();
       r.call();
       r=new Cc();
       r.call();
    }
}

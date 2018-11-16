package super_function;

public class Box {
	
	 private int height;
	 private int width;
	 private int depth;
	
	Box(){}
	
	Box(int height,int width,int depth)
	{
		this.depth=depth;
		this.height=height;
		this.width=width;
		
		System.out.println(height+" "+width+" "+depth);
	
	}

}

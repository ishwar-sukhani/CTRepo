package super_function;

public class MatchBox extends Box{
     int sticks;
     
      MatchBox(int sticks, int height, int width, int depth) {	                // int height, int width, int depth
       super(height, width, depth);
       this.sticks = sticks;
	}
}

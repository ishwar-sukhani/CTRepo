package abstract_test;


abstract public class Shape {

	  abstract int calArea();
	  abstract int calPari();
	  
	 }

class Shape1 extends Shape{

	@Override
	int calArea() { 
		return 10;
	}

	@Override
	int calPari() { 
		return 0;
	}
	
	
}

class Shape2 extends Shape{

	@Override
	int calArea() { 
		return 15;
	}

	@Override
	int calPari() {
		return 0;
	}
}
 class Shape3 extends Shape{

		@Override
		int calArea() { 
			return 30;
		 
	}

		@Override
		int calPari() { 
			return 0;
		}
}
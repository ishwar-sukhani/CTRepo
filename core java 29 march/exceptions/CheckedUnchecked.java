package exceptions;

import java.io.IOException;

public class CheckedUnchecked {
	void m1()
	{
		throw new ArithmeticException();
	}
	void m2()
	{
		throw new NullPointerException();
	}
	void m3()
	{
		throw new ArrayIndexOutOfBoundsException();
	}
	void m4()throws IOException
	{
		throw new IOException();
	}
	void m5()throws InterruptedException
	{
		throw new InterruptedException();
	}
}

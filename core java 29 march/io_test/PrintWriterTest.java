package io_test;

import java.io.PrintWriter;

public class PrintWriterTest {
	public static void main(String[] args) 
    {
     PrintWriter pw=new PrintWriter(System.out,true);
     pw.println("hello to java");
     int i=10;
     long l=12345;
     pw.println(i);
     pw.println(l);
    }

}

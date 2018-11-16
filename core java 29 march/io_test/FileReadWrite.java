package io_test;
import java.io.*;
public class FileReadWrite {

	public static void main(String[] args) throws IOException 
	{
		
		byte[] arr = new byte[10000];
		FileInputStream fis=null;
		FileOutputStream fos=null;
	 
		fis=new FileInputStream("d:/IO/DATA.txt");   
		fos=new FileOutputStream("d:/IO/data1.txt",true);
	 
	   fis.read(arr);
	 fos.write(arr);
	 System.out.println("File Wriiten....");    
	      
	     fis.close();
	     fos.close();     
	}
}

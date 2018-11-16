package io_test2;
import java.io.*;
public class SerializeUse {
	public static void main(String[] args) throws Exception
	{
	StudentData student1=new  StudentData ("a100","ashutosh",56);
	StudentData  student2=new   StudentData ("a101","rahul",60);
	FileOutputStream FOS  = new FileOutputStream ("d:/IO/StudentRecord.txt",true);
	ObjectOutputStream OOS = new ObjectOutputStream (FOS);
	OOS.writeObject(student1);
	OOS.writeObject(student2);

	FileInputStream fis=new FileInputStream("d:/IO/StudentRecord.txt");
	ObjectInputStream ois =new ObjectInputStream(fis);
	StudentData  d1=(StudentData)ois.readObject();
	StudentData   d2=(StudentData)ois.readObject();
	System.out.println("first record ....>\t"+d1);
	System.out.println("second record....> \t"+d2);

	FOS.close();
	fis.close();
	OOS.close();
	ois.close();
	  }
}

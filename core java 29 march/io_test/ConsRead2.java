package io_test;



import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ConsRead2 {
	public static void main(String[] args) 
    {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	String str[]=new String[100];
	System.out.println("enter the multiple line");
	System.out.println("enter 'stop' to quit");
	try
		{
		for(int i=0;i<100;i++)
		   {
		    str[i]=br.readLine();
		    if(str[i].equals("stop"))
			 break;
		    }
		}catch (Exception e) {System.out.println(e);}
	System.out.println("here is your data");
		for(int i=0;i<100;i++)	
	 		 {
				System.out.println(str[i]);
				if(str[i].equals("stop"))
				 break;  
			 }  
		}   
	}




package io_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsRead 
	 {
	 public static void main(String[] args) 
	   {
	     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	    
	     System.out.println("enter q to quit");
	     char c='a';
	     do
	       {
	         try{
	             c=(char)br.read();
	             System.out.println(c);
	              }catch (Exception e) {}   
	       }while(c!='q');
	    }
	 }	
 

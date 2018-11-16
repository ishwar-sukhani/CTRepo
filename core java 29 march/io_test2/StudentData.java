package io_test2;

import java.io.Serializable;
 
	public class StudentData
	{
		 
		String sid,sname;
		int marks;
		public StudentData(String sid,String sname,int marks) 
			{
			this.sid=sid;
			this.sname=sname;
			this.marks=marks;
			}
		public String toString()
			{
			return sid+"   "+sname+"  "+marks;
			}
	}


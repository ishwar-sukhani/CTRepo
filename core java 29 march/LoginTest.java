package jdbc_test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginTest {

	
	public boolean login(int id,String name) throws Exception{
		
		Connection con=ConnectionProvider.getConn();
		 PreparedStatement pst=con.prepareStatement
				("select * from student where id= ? and Name = ?");
		 
		 pst.setInt(1,id);
		 pst.setString(2,name);
		 
		 ResultSet rs=pst.executeQuery(); 
		
     if(rs.next())
    	 return true;
     else
    	 return false;

	}}

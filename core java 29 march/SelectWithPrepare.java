package jdbc_test;

import java.sql.*; 
import java.util.Scanner;
public class SelectWithPrepare  {
	
	public static void main(String[] args) throws Exception{
		

		Connection connection=null;
		Statement st=null;
		ResultSet rs=null;
		 
			DriverManager.registerDriver(new com.mysql.jdbc.Driver()); 
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCtest","root","root"); 
			
		 PreparedStatement pst=connection.prepareStatement
				("select * from student where id= ? and name = ?");
		 
		
				 
		 pst.setInt(1,100);
		 pst.setString(2, "abc");
		 
		 rs=pst.executeQuery();
		 while (rs.next())
		 {
			 System.out.println(rs.getInt(1));
			 System.out.println(rs.getString(2));
		 }
		
		
	}

}

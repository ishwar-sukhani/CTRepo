package jdbc_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Edit {
	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCTest","root", "root");
		
		PreparedStatement ps=con.prepareStatement("update student set Name=? where id=?" );
		
		ps.setString(1, "New Name");
		ps.setInt(2, 100);
		int updateCount=ps.executeUpdate();
		System.out.println(updateCount +"Record Updated");
		
	}
	
	

}

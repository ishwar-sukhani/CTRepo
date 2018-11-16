package jdbc_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {

	
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/JDBCTest","root", "root");
		PreparedStatement ps =  con.prepareStatement("insert into student values (?,?)");
		ps.setInt(1, 111);
		ps.setString(2, "citius"); 
		System.out.println(ps.executeUpdate() +" record inserted");
		
	}
}

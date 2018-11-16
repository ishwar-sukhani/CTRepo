package jdbc_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {

	
	
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/TestJDBC","root", "root");
		
		PreparedStatement  ps=con.prepareStatement("delete from Student where id=?");
		  ps.setInt(1, 200);
		  System.out.println(ps.executeUpdate()+"record deleted");
	}
}

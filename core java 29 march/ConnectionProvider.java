package jdbc_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement; 

public class ConnectionProvider {
	static  private Connection con;
	public static Connection getConn() throws SQLException,ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/TestJDBC","root", "root");
		return con;
		
	}

}










































/*insertCandidate("Bush", "Lily", Date.valueOf("1980-01-04"), 
        "bush.l@yahoo.com", "(408) 898-6666");*/
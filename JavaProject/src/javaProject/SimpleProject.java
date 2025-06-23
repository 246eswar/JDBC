package javaProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleProject {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load and register
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/college";
		String user="root";
		String password="root";
		//establishment the connection
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement() ;
		String createTable="create table if not exists facutly(fac_id int primary key,name varchar(100))";
		System.out.println("table Created");
		//create a statement
		stmt.executeUpdate(createTable);
		//processing
		
		//close connection
		if(con!=null) {
			con.close();
		}
		
		
	}

}

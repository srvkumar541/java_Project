package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
		try {
			// Eastabilsh connection object
			Connection conn = DriverManager.getConnection(url,"root","Angular@12345");
			// create statment object to send to database
			Statement statement = conn.createStatement();
			//Execute statement
			//ResultSet resultset = statement.executeQuery("select * from employees_tbl");
			int inserted = statement.executeUpdate("\r\n"
					+ "insert into employees_tbl values(900,'Sauravl','Sales',5500);");
//			while(resultset.next()) {
//				System.out.println(resultset.getInt("salary"));
//			}
			if(inserted ==1) {
				System.out.println("Inserted into employee table ");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

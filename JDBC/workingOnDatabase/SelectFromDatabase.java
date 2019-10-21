package workingOnDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectFromDatabase {
	public static void main(String[] args ) {
		System.out.println("Displaying values in mysql database table!");
		
		Connection conn = null;
		Statement st = null;
		//JDBC driver name and database url
		String url = "jdbc:mysql://localhost:3306/";
		String db = "learntrix";
		String driver = "com.mysql.jdbc.Driver";
		try {
			//Registering the driver
			Class.forName(driver);
			//Open a connection
			conn = DriverManager.getConnection(url + db, "root", "Ankush@1621999");
			try {
				st = conn.createStatement();
				String sql = "select * from jdbctest.employee";
				System.out.println(sql);
				ResultSet val = st.executeQuery(sql);
				
				while(val.next()) {
					//Retrieve by column name
//					String id = val.getString("empId");
//					String name = val.getString("name");
//					int salary = val.getInt("salary");
					
					//This can also be done by using column index
					//Index for first column is always 1 in sql
					String id = val.getString(2);
					String name = val.getString(3);
					int salary = val.getInt(4);
					
					//Display values
					System.out.println("ID : " + id);
					System.out.println("Name : " + name);
					System.out.println("Salary : " + salary);
				}
				val.close();
			} catch(SQLException s) {
				System.out.println("SQL statement is not executable! Error is: " + s.getMessage());
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

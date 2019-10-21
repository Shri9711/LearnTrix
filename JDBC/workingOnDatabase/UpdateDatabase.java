package workingOnDatabase;

import java.sql.*;

public class UpdateDatabase {
	public static void main(String[] args ) {
		System.out.println("Updating values in mysql database table!");
		
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String db = "learntrix";
		String driver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url + db, "root", "Ankush@1621999");
			try {
				Statement st = conn.createStatement();
				String sql = "update jdbctest.employee"
						+ " set salary = " + 30000 + " where name = 'Ankush Chavan'";
				System.out.println(sql);
				int val = st.executeUpdate(sql);
				System.out.println("1 row affected + return value: " + val);
			} catch(SQLException s) {
				System.out.println("SQL statement is not executable! Error is: " + s.getMessage());
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

package jdbc;
import java.sql.*;

public class MysqlConnect {
	public static void main(String[] args ) {
		System.out.println("Inserting values in mysql database table!");
		
		Connection conn = null;
		String url = "jdbc:mysql://192.168.43.6";
		String db = "learntrix";
		String driver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url + db, "root", "ankush");
			try {
				Statement st = conn.createStatement();
				String sql = "insert into jdbctest.employee"
						+ " values(" + 3 + "," +
						"'ABC1'" + "," + 
						"'Ankush Chavan'" + "," + 
						"20000)";
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

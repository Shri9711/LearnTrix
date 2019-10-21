package jdbc_batch_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class JDBCBatchUpdate {
	public static void main(String[] args ) {
		System.out.println("Updating values in mysql database table!");
		
		Connection conn = null;
		PreparedStatement st = null;
		
		String url = "jdbc:mysql://localhost:3306/";
		String db = "learntrix";
		String driver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url + db, "root", "Ankush@1621999");
			conn.setAutoCommit(false);
			try {
				String sql = "update jdbctest.employee"
						+ " set salary = ? where name = ?";
				st = conn.prepareStatement(sql);
				st.setInt(1, 45000);
				st.setString(2, "Ankush Chavan");
				st.addBatch(); //we can execute multiple queries at a time by using batch
				
				st.setInt(1, 65000);
				st.setString(2, "Roshan");
				st.addBatch();
				
				System.out.println(sql);
				int[] val = st.executeBatch();
				System.out.println("1 row affected + return value: " + Arrays.toString(val));
				
				//Displaying the records
				String sql1 = "select * from jdbctest.employee";
				System.out.println(sql1);
				ResultSet val1 = st.executeQuery(sql1);
				
				while(val1.next()) {
					//Retrieve by column name
					String id = val1.getString("empId");
					String name = val1.getString("name");
					int salary = val1.getInt("salary");
					
					//Display values
					System.out.println("ID : " + id);
					System.out.println("Name : " + name);
					System.out.println("Salary : " + salary);
				}
				
			} catch(SQLException s) {
				System.out.println("SQL statement is not executable! Error is: " + s.getMessage());
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) {
					conn.commit();
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Goodbye!");
		}
	}
}

package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {//Step1 : Load The Driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//Step 2: Get The Connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//Step 3: Issue Sql Query
			String sql = " insert into employee_info " + " values(6, 'Giridhara',10000,'M') ";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			//Step 4: Read The Result
			System.out.println(count + " Row(s) inserted");
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
	}//End of main()

}

package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class ExecuteDeleteQuery {
	
	public static void main(String[] args) {
		
		Statement st = null;
		Connection con = null;
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			con = DriverManager.getConnection(url);
			String sql = "delete from employee_info where id=6";
			st = con.createStatement();
			int count = st.executeUpdate(sql);
			
			System.out.println(count + " Row(s) Deleted");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null) {
					con.close();
				}
				if(st!=null) {
					st.close();
				}
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

}

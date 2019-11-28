package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DynamicDelete {
	
	public static void main(String[] args) {
		
		
		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			con = DriverManager.getConnection(url);
			String sql = "delete from employee_info where id= ?";
			pstmt= con.prepareStatement(sql);
			
			
			pstmt.setInt(1, Integer.parseInt(args[0]));
			
			int count = pstmt.executeUpdate();
			
			System.out.println(count + " Row(s) Deleted");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null) {
					con.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

}

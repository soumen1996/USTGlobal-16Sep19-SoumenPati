package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class LatestDynamicDelete {
	
	public static void main(String[] args) {
		
		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver"); //jdbc 3
//			Driver driver = new Driver();   Old coding structure
//			DriverManager.registerDriver(driver)
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			con = DriverManager.getConnection(url);
			String sql = "delete from employee_info where id= ?";
			pstmt= con.prepareStatement(sql);
			
			
			pstmt.setInt(1, Integer.parseInt(args[0]));
			
			int count = pstmt.executeUpdate();
			
			System.out.println(count + " Row(s) Deleted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null) {
					con.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	
		
	}

}

package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DynamicSelectQuery {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		
		try {
			
			//Step 1 
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//Step 2 Get The Connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?"+"user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//Step 3 Issue SQL Query
			String sql = "select * from employee_info where id=?";
			pstmt = conn.prepareStatement(sql);
			String empid = args[0];//Because we need only one value
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery();//no need of passing sql again
			
			//Step 4 read the result
			if(rs.next()) {
				int emp_id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");
				
				System.out.println("Id: "+id);
				System.out.println("Name: "+name);
				System.out.println("Salary: "+sal);
				System.out.println("Gender: "+gender);
				System.out.println("****************");
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			//Step 5 close all jdbc resources
			try {
				if(conn != null) {
					conn.close();
				}
				
				if(pstmt != null) {
					pstmt.close();
				}
				if(rs != null) {
					rs.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				
				e.printStackTrace();
			}
		}
		
		
		
 		
	}
}

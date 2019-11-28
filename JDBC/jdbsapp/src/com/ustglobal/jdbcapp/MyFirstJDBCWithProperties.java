package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.*;
import java.util.Properties;

public class MyFirstJDBCWithProperties {
	
public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		FileReader reader = null;
		
		try {
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			//Step 1 
			Class.forName("com.mysql.jdbc.Driver");
			
			//Step 2 Get The Connection
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);
//			
			
			//Step 3 Issue SQL Query
			stmt = conn.createStatement();
			String sql = "select * from employee_info";
			rs = stmt.executeQuery(sql);
			
			//Step 4 read the result
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");
				
				System.out.println("Id: "+id);
				System.out.println("Name: "+name);
				System.out.println("Salary: "+sal);
				System.out.println("Gender: "+gender);
				System.out.println("****************");
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//Step 5 close all jdbc resources
			try {
				if(conn != null) {
					conn.close();
				}
				
				if(stmt != null) {
					stmt.close();
				}
				if(rs != null) {
					rs.close();
				}
				if(reader!= null){
					reader.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				
				e.printStackTrace();
			}
		}
		
		
		
 		
	}

}

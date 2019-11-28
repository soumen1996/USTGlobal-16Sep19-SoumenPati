package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class InsertQueryProperties {
	
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			
			//Step1 : Load The Driver
			Class.forName(prop.getProperty("driver-class-name"));
			//Step 2: Get The Connection
//			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			String url =prop.getProperty("url");
			conn = DriverManager.getConnection(url, prop);
			
			//Step 3: Issue Sql Query
//			String sql = " insert into employee_info values(?,?,?,?) ";
			pstmt = conn.prepareStatement(prop.getProperty("insert-query"));
			
			
			String empid  = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			String name = args[1];
			pstmt.setString(2,name);
			
			String empsal = args[2];
			int sal = Integer.parseInt(empsal);
			pstmt .setInt(3, sal);
			
			String gender = args[3];
			pstmt.setString(4, gender);
			
			int count = pstmt.executeUpdate();//noo need of passing arguement beacuse already passed
			
			
			//Step 4: Read The Result
			System.out.println(count + " Row(s) inserted");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}

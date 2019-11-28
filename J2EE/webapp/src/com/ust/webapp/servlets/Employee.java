package com.ust.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Employee extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String empid = req.getParameter("empid");
		String driverClass = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?"+"user=root&password=root";
		
		Connection conn = null;
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		PrintWriter out = resp.getWriter();
		
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			

			String sql = "select * from employee_info where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, empid);
			rs = pstmt.executeQuery();
			
		
			out.println("<table>");
			out.println("<thead>");
			out.println("<th> id </th>");
			out.println("<th> name </th>");
			out.println("<th> sal </th>");
			out.println("<th> gender </th>");
			out.println("</thead>");
			
			
			while(rs.next()) {
				
				out.println("<tbody>");
				out.println("<tr>");
				out.println("<td>");
				out.println(rs.getInt(1));
				out.println("</td>");
				
				out.println("<td>");
				out.println(rs.getString(2));
				out.println("</td>");
				
				out.println("<td>");
				out.println(rs.getInt(3));
				out.println("</td>");
				
				out.println("<td>");
				out.println(rs.getString(4));
				out.println("</td>");
				
				out.println("</tr>");
				out.println("</tbody>");
			}
			out.println("</table>");
			
		}catch(Exception e) {
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
			} catch (Exception e1) {
				// TODO: handle exception
				
				e1.printStackTrace();
			}
		}
	}

}

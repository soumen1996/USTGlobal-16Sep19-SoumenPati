package com.ust.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlets extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("service method");
		System.out.println("extra line of code");
		
		ServletContext context = getServletContext();
		String compnayName =  context.getInitParameter("company-name");
		
		ServletConfig config = getServletConfig();
		String batchName = config.getInitParameter("batch-name");
		
		PrintWriter out = resp.getWriter(); 
		/*PrintWriter is concrete class.We shouldn't create PrintWriter object using 'new' keyward 
		 * because it'll not be a responsible object,we cant't interact with browser.*/
		
		resp.setContentType("text/html");
		/*we are setting the content type,browser only understand HTML.This particular servlets genarate only HTML file.
		 * by default it will take text.So for text.html we don't have to mention it.It is not mandatory.Except
		 * HTML we have to mention.*/
		
		out.println("<html>");
		/*println() is used to print*/
		out.println("<body>");
		
		Date date = new Date();
		/*Date is java object,We are creating it for getting the current Date.*/ 
		out.println("<h1 style = 'color : Red'>Date and Time is: ");
		out.println(date.toString());
		/*Genarate the string representation of string.*/
		out.println("</h1>");
		
		out.println("<h2>");
		out.println(compnayName);
		out.println("</h2>");
		
		out.println("<h2>");
		out.println(batchName);
		out.println("</h2>");
		
		String url = req.getRequestURI();
		String method = req.getMethod();
		out.println("<br>");
		out.println(url);
		out.println("<br>");
		out.println(method);
		
		
		out.println("</body>");
		out.println("</html>");
		
		/*Everytime we make a request,this line of code will re-execute again and again.*/
	}//end of doGEt

}//end of MyFirstServlets

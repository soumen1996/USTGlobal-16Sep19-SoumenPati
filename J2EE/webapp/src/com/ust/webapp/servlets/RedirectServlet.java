package com.ust.webapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String search = req.getParameter("search");
		String select = req.getParameter("select");
		if(select.equals("Bing")) {
			resp.sendRedirect("https://www.bing.com/search?q="+search);
		}
		else if(select.equals("Google")){
			resp.sendRedirect("http://www.google.com/search?q="+search);	
		}
		else {
			resp.sendRedirect("http://www.yahoo.com/search?q="+search);
		}
				
		
	}//end of doGet

}//end of RedirectedServlet

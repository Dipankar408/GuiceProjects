package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;


import com.google.inject.Singleton;

@Singleton
public class DemoServlet extends HttpServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
		super.service(req, resp);
//		PrintWriter prt=resp.getWriter();
//		prt.println("Welcome to Guice Servelt");
//		System.out.println("Hello");
	}
	
}

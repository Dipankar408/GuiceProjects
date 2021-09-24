package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class DemoServlet extends HttpServlet {
	@Inject
	private String str="Hello Guice";
	
//	@Inject
//	public DemoServlet(String str) {
//		this.str=str;
//	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -2249203600827328177L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.doGet(req, resp);
//		System.out.println("Hello");
		resp.getWriter().println("Hoi gol");
//		resp.getOutputStream().print(str);
	}

//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.doPost(req, resp);
//		;
//	}
}

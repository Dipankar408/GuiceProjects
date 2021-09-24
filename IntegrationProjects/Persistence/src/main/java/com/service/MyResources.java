package com.service;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
//@WebServlet("home")
@Path("/")
public class MyResources {

	@Inject
	IntService svc;
	
	@POST
	@Path("find")
	public void showDetails(@Context HttpServletRequest req, @Context HttpServletResponse resp) throws IOException
	{
		System.out.println("save");
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		
		svc.finds(id,name,age);
		
		resp.getWriter().print("Successfully saved");
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		System.out.println("save");
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		
		svc.finds(id,name,age);
		
		resp.getWriter().print("Successfully saved");
	}
	
}

package service;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Inject;

public class HelloWorldImpl implements HelloWorld {
	private HttpServletRequest req;
	private HttpServletResponse resp;
	
	@Inject
	public HelloWorldImpl(HttpServletRequest req,HttpServletResponse resp)
	{
		this.req=req;
		this.resp=resp;
	}
	@Override
	public void execute() throws IOException {
		  String name = req.getParameter( " user " );
		  if (name == null || name.length() < 1 )name = " Guest " ;
		  resp.getWriter().append(String.format( " Hello, %s. %s -> sessionId=%s,hashCode=%d  " , name,new Date(),req.getSession().getId(),hashCode()));
		
	
	}

}

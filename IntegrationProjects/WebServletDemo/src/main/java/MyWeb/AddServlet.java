package MyWeb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.google.inject.Singleton;

@Singleton
public class AddServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
		PrintWriter out = resp.getWriter();
		out.println("Addition of " + i + " & " + j + " is " + k);
//		RequestDispatcher rd=req.getRequestDispatcher("/home.jsp");
//		rd.forward(req, resp);
	}

}

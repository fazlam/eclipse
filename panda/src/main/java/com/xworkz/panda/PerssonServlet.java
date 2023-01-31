package com.xworkz.panda;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 16,urlPatterns = "/sms")
public class PerssonServlet extends HttpServlet{
	
	public PerssonServlet() {
	System.out.println("Created :" +this.getClass().getSimpleName());
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running the do post in PerssonServlet");
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String gender=req.getParameter("gender");
		String reason=req.getParameter("reason");
		String address=req.getParameter("address");
		
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(gender);
		System.out.println(reason);
		System.out.println(address);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("display.jsp");
		req.setAttribute("fname", fname);
		req.setAttribute("lname", lname);
		req.setAttribute("gender", gender);
		req.setAttribute("reason", reason);
		req.setAttribute("address", address);
		
		dispatcher.forward(req, resp);
		
	}

}

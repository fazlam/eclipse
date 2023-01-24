package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 6,urlPatterns = "/nice")
public class ShammiServlet extends HttpServlet{
	public ShammiServlet() {
		System.out.println("Create the shammi servlet by sueing no arg const.");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Running the do get in Shammi servlet ");
	}

}

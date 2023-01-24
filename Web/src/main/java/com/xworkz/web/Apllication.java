package com.xworkz.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 8,urlPatterns = "/let")
public class Apllication extends HttpServlet{
	
	public Apllication() {
		System.out.println("Created the Apllication by useing no argu const..");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running the Do get method in Apllication");
		String data="Displaying the data as doget";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running the Do post method in Apllication");
		String data="Displaying the data as DoPost";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running the Do put method in Apllication");
		String data="Displaying the data as DoPut";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");	
	}
	

}

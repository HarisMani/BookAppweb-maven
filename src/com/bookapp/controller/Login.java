package com.bookapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bookappcore.user.*;
import com.bookappcore.dao.*;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append(".").append(request.getContextPath());
		response.setContentType("text/jsp");
		PrintWriter out = response.getWriter();

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		UserDao dao = new UserDao();
		try {
			boolean flag = dao.login(user);
			if (flag == true) {
				/*
				 * final PrintWriter a=response.getWriter();
				 * a.println("welcome user"); //
				 * response.sendRedirect("Success.jsp"); o
				 */
				
				out.print("Welcome, " + email);
				HttpSession session = request.getSession();
				session.setAttribute("email", email);
				request.getRequestDispatcher("Home.jsp").include(request, response);

				// response.sendRedirect("Home.jsp");

			} else {
				final PrintWriter a = response.getWriter();
				a.println("Please check ur details provided");
				response.sendRedirect("Failure.jsp");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * protected void doPost(HttpServletRequest request, HttpServletResponse
		 * response) throws ServletException, IOException { // TODO
		 * Auto-generated method stub doGet(request, response); }
		 */
	}
}
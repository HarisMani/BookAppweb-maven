package com.bookapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookappcore.dao.UserDao;
import com.bookappcore.user.User;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("WELCOME USER ").append(request.getContextPath());
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		UserDao dao = new UserDao();
		try {
			dao.register(user);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		response.sendRedirect("Login.jsp");

	}

	/*
	 * protected void doPost(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { // TODO Auto-generated
	 * method stub doGet(request, response); }
	 */

}
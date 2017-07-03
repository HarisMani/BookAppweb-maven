package com.bookapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookappcore.book.book.Book;
import com.bookappcore.book.dao.Bookdao;
import com.bookappcore.dao.UserDao;
import com.bookappcore.user.User;

@WebServlet("/Addbook")
public class Addbook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * response.getWriter().append("BOOK ADDED SUCCESSFULLY.. ");
		 * response.se
		 */
		PrintWriter out = response.getWriter();

		String s = request.getParameter("id");
		int id = Integer.parseInt(s);
		String name = request.getParameter("name");
		String p = request.getParameter("price");
		int price = Integer.parseInt(p);
		Book book = new Book();
		book.setId(id);
		book.setName(name);
		book.setPrice(price);
		Bookdao dao = new Bookdao();
		try {
			dao.addbook(book);
			request.getRequestDispatcher("Home.jsp").include(request, response);
			out.print("You are successfully Added a book!");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.sendRedirect("Failure.jsp");

			e.printStackTrace();
		}

	}

}

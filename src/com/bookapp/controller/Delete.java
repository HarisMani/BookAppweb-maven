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

@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String p = request.getParameter("id");
		int id = Integer.parseInt(p);
		Book book = new Book();
		book.setId(id);
		Bookdao dao = new Bookdao();
		try {
			dao.delete(book);
			request.getRequestDispatcher("Home.jsp").include(request, response);
			out.print("You are successfully deleted a book!");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

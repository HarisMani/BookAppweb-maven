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

@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String i = request.getParameter("id");
		int id = Integer.parseInt(i);
		String pri = request.getParameter("price");
		int price = Integer.parseInt(pri);
		Book book = new Book();
		book.setId(id);
		book.setPrice(price);
		Bookdao dao = new Bookdao();
		try {
			dao.update(book);
			request.getRequestDispatcher("Home.jsp").include(request, response);
			out.print("You are successfully updated price!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

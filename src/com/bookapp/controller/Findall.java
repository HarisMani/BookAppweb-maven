package com.bookapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookappcore.book.book.Book;
import com.bookappcore.book.dao.Bookdao;

@WebServlet("/Findall")
public class Findall extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Bookdao dao = new Bookdao();
		try {
			List<Book> book1 = dao.findall();

			RequestDispatcher dispatcher = request.getRequestDispatcher("viewall.jsp");
			request.setAttribute("list1", book1);
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
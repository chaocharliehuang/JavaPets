package com.codingdojo.pets.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingdojo.pets.models.*;

@WebServlet("/cat")
public class showCat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String breed = request.getParameter("breed");
		double weight = Double.parseDouble(request.getParameter("weight"));
		
		Cat cat = new Cat(name, breed, weight);
		request.setAttribute("cat", cat);
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/showCat.jsp");
        view.forward(request, response);
	}
}

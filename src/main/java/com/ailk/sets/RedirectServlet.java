package com.ailk.sets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet {

	private static final long serialVersionUID = 1293427376732333854L;

	public RedirectServlet() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String q = request.getQueryString();
		String url = "http://182.92.1.225" + request.getRequestURI() + (q == null ? "" : ("?" + q));
		response.sendRedirect(url);
	}

}

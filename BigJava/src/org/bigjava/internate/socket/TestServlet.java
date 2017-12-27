package org.bigjava.internate.socket;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException {

		super.init();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {

		PrintWriter out = response.getWriter();

		out.println("The message come from TestServle");
	}
}

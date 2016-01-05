package ua.kharkov.nure.kozlov.task2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Calc
 */
@WebServlet("/Calc")
public class Calc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doPost");
		
		response.setContentType("application/json");
		response.setHeader("Cache-Control", "nocache");
        response.setCharacterEncoding("utf-8");

		Float operator1 = null;
		Float operator2 = null;
		String operation = null;
		try {
			operator1 = Float.parseFloat(request.getParameter("operator1"));
			operator2 = Float.parseFloat(request.getParameter("operator2"));
			operation = request.getParameter("operation");
			float result = 0;
			switch (operation) {
			case "+":
				result = operator1 + operator2;
				break;
			case "-":
				result = operator1 - operator2;
				break;
			case "/":
				result = operator1 / operator2;
				break;
			case "*":
				result = operator1 * operator2;
				break;
			}
			request.setAttribute("result", result);

		} catch (Exception e) {	
			request.setAttribute("result", "incorrect data");
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);  
	}

}

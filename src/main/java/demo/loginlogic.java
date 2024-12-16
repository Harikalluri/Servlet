package demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class loginlogic  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String un=req.getParameter("username");
		String pwd=req.getParameter("password");
		
		if(pwd.equals("123")) {
			req.setAttribute("message", "Login success");
			req.setAttribute("username", un);
		req.getRequestDispatcher("Home.jsp").forward(req, resp);
		}
		else {
			req.setAttribute("message", "Invalid Password");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
	}
}

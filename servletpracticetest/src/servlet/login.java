package servlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public login() {

    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("uname");
		System.out.println("username: "+user);
		String pass = request.getParameter("pass");
		System.out.println("Password: "+ pass);
		
		String hiddenVal = request.getParameter("hd");
		System.out.println("the hidden value is: "+ hiddenVal);
		
		if(pass.equals("aksy")){
			System.out.println("login success");
			request.setAttribute("hidden",hiddenVal);
			response.sendRedirect("profile.jsp");
		}
		else
		{
			System.out.println("login failed");
			response.sendRedirect("Login.html");
		}
		
	}

}

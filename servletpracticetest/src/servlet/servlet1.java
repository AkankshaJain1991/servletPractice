package servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public servlet1() {
        super();

    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try{
			response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			
			String n = request.getParameter("uname");
			out.print("welcome: "+n);
			
			Cookie ck = new Cookie("uname",n);
			response.addCookie(ck);
			
			out.print("<form action = 'servlet2' method='post'>");
			out.print("<input type='submit' value='go'>");
			out.print("</form>");
			
			out.close();
		}
		catch(Exception e){
			System.out.println("the exception is: "+ e);
		}
	}

}

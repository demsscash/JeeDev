package ecole;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Administrateur extends HttpServlet{
    public Administrateur() {
		super();
		// TODO Auto-generated constructor stub
	}


	private static String login="admin";
    private static String pass="admin";
    
	public static String getLogin() {
		return login;
	}
	public static void setLogin(String login) {
		Administrateur.login = login;
	}
	public static String getPass() {
		return Administrateur.pass;
	}
	public static void setPass(String pass) {
		Administrateur.pass = pass;
	}
	public Administrateur(String login, String pass) {
		super();
		Administrateur.login = login;
		Administrateur.pass = pass;
	}
	

	protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<HTML>");
		out.println("<body>");
		out.println("<h1>Bienvenu</h1>");
		out.println("</body>");
		out.println("</HTML>");
	}
	

}

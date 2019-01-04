package ecole;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


/**
 * Servlet Filter implementation class FtConnexion
 */
@WebFilter("/FtConnexion")
public class FtConnexion implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out =response.getWriter();
		String logine1=request.getParameter("login");
		String pass1=request.getParameter("pass");
				 
		
		 if(logine1.contentEquals(Administrateur.getLogin()) && pass1.contentEquals(Administrateur.getPass())) {
			 chain.doFilter(request, response);
		 }else {
			 out.println("les donnes saisie sont incorecte ");
		 }
		
		
		
		// pass the request along the filter chain
		
	}
	

	public FtConnexion() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void destroy() {
		// TODO Auto-generated method stub
	}


	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}

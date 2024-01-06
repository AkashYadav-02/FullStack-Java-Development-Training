package com.aurionpro.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie
 */
@WebServlet("/Cookie")
public class CookieTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		Cookie[] cookies=request.getCookies();
	    boolean isColorSet=false;
	    PrintWriter out =response.getWriter();
	    
	    if(cookies!=null){
	    	for(Cookie c: cookies){
	    		if( c.getName().equals("color")){
	    			String bgcolor=c.getValue();
	    			out.println("<p> Cookie is set color is :"+bgcolor+"</p>");
	    			isColorSet=true;
	    		}
	    	}
	    }
	    if(!isColorSet){
	    	Cookie newCookie=new Cookie("color","red");
	    	newCookie.setMaxAge(60*60*24);
	    	response.addCookie(newCookie);
	    	isColorSet=true;
	    }
	    
	   	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.aurionpro.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import com.aurionpro.model.Admin;
import com.aurionpro.model.BankDbUtil;
import com.aurionpro.model.User;



@WebServlet("/loginController")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name="jdbc/bank-source")
	private DataSource dataSource;
	
	private  BankDbUtil dbUtil;
    
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		 dbUtil=new BankDbUtil(dataSource);
	}
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action=request.getParameter("action");
		System.out.println(action);
		if(action==null) {
			action="start";
		}
		
		switch(action) {
		case "start": loadData(request,response);
		break;
		case "admin": adminPage(request,response);
		break;
		case "user": userPage(request,response);
		break;
		case "logout": logoutUser(request,response);
		break;
		
	
		
		}
		
	}

	
	private void logoutUser(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		 try {
		        HttpSession session = request.getSession(false); // Ensure false is used to prevent a new session creation if none exists
		        if (session != null) {
		            session.invalidate();
		        }
		        RequestDispatcher dispatcher = request.getRequestDispatcher("/user.js");
		        dispatcher.forward(request, response);
		    } catch (Exception e) {
		        e.printStackTrace(); // Print the stack trace for debugging purposes
		        // Handle the error or redirect to an error page
		    }
		
	}


	private void userPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		List<User> userList=dbUtil.userList();
		
		 String  userName=request.getParameter("email");
		 String   password= request.getParameter("password");
		 System.out.println("in user "+userName+password);
		  User userData=dbUtil.findUserById(userName,password );
		  System.out.println("user data from data base :"+userData);
		  
		 
		 
		 if(userData!=null) {
			 HttpSession session=request.getSession(true);
			 session.setAttribute("userData", userData);
			RequestDispatcher dispatcher = request.getRequestDispatcher("userController");
			dispatcher.forward(request, response);
			  
		 }
			 
		 else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
				dispatcher.forward(request, response);
		 }
			
		
	}


	private void adminPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
//		List<Admin> adminList=dbUtil.adminList();
		
		 String email=request.getParameter("email");
		 String password= request.getParameter("password");
		 System.out.println("in Admin "+email+password);
		 
		  Admin adminData=dbUtil.findAdminById(email,password );
		  System.out.println("admin data from data base :"+adminData);
		  
		  
		  
	 if(adminData!=null) {
		 HttpSession session=request.getSession(true);
		 session.setAttribute("adminData", adminData);
		RequestDispatcher dispatcher = request.getRequestDispatcher("adminController");
		dispatcher.forward(request, response);
		  
	 }
		 
	 else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
			dispatcher.forward(request, response);
	 }
		
	}


	private void loadData(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
		dispatcher.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}


	

}

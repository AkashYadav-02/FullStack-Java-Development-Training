package com.aurionpro.controller;

import java.io.IOException;
import java.sql.SQLException;
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

import com.aurionpro.model.BankDbUtil;
import com.aurionpro.model.Transaction;
import com.aurionpro.model.User;

/**
 * Servlet implementation class adminController
 */
@WebServlet("/adminController")
public class adminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Resource(name = "jdbc/bank-source")
	private DataSource dataSource;
	private BankDbUtil dbUtil;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		dbUtil = new BankDbUtil(dataSource);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String actionType = request.getParameter("action");

		System.out.println("actiontype on " + actionType);
		if (actionType == null) {
			actionType = "admin";
		}
		try {
			switch (actionType) {
			case "admin":
				loadData(request, response);
				break;
			case "userList":
				loadUserList(request, response);
				break;
			case "transaction":
				loadTransaction(request, response);
				break;
			case "update":
				updateuser(request, response);
				break;
			case "loadUser":
				loadUser(request,response);
				break;
			case "delete":
				deleteUser(request, response);
				break;
			case "logout":
				logoutAdmin(request, response);
				break;

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void logoutAdmin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    HttpSession session = request.getSession(false); // Retrieves the session without creating a new one if it doesn't exist

	    if (session != null) {
	        session.invalidate(); // Invalidates the session, effectively logging the admin out
	    }

	    // Redirect the admin to the login page or any other desired page after logout
	    response.sendRedirect("loginController"); // Replace "loginController" with your desired redirect page
	}

	private void loadUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int userid = Integer.parseInt(request.getParameter("id"));
		User user=	dbUtil.findUserByid(userid);
		request.setAttribute("user", user);
		System.out.println(user);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/update.jsp");
		dispatcher.forward(request, response);
		
	}

	private void deleteUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int userid = Integer.parseInt(request.getParameter("id"));
				this.dbUtil.deleteUser(userid);
		loadUserList(request, response);

	}

	private void updateuser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("Call Update");
		int userid = Integer.parseInt(request.getParameter("id"));
		String fname=request.getParameter("firstname");
		String lname=request.getParameter("lastname");
		String userName=request.getParameter("username");
		int status= Integer.parseInt(request.getParameter("command"));
		String password=request.getParameter("password");
		User user=new User(userid,fname,lname,	status,userName,password);
		
		System.out.println("Updated data :"+user);
		this.dbUtil.updateUser(user,userid);
        loadUserList(request, response);


	}

	private void loadTransaction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Transaction> transactionList = dbUtil.loadAllTransaction();
		request.setAttribute("t_list", transactionList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/transactionList.jsp");
		dispatcher.forward(request, response);
	}

	private void loadUserList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<User> user = dbUtil.loadAllUser();
		request.setAttribute("user_list", user);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/userList.jsp");
		dispatcher.forward(request, response);
	}

	private void loadData(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("/admin.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

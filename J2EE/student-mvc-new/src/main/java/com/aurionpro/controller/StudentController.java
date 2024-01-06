package com.aurionpro.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.aurionpro.model.Student;
import com.aurionpro.model.StudentDbUtil;

@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	@Override
	public void init() throws ServletException {
		super.init();
		dbUtil = new StudentDbUtil(dataSource);

		System.out.println("inside init ");
	}

	public StudentController() {
		System.out.println("inside constructior ");
	}

	private static final long serialVersionUID = 1L;

	@Resource(name = "jdbc/student-source")
	private DataSource dataSource;

	private StudentDbUtil dbUtil;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String actionType = request.getParameter("action");
		if (actionType == null) {
			actionType = "list";
		}
		try {
			switch (actionType) {
			case "list":
				listStudent(request, response);
				break;
			case "add":
				addStudent(request, response);

				break;

			case "load":
				loadStudent(request, response);
				break;
			case "update":
				updateStudent(request, response);
				break;
			case "delete":
				deleteStudent(request, response);
				break;
			case "search":
				searchStudent(request, response);
				break;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Student> studentList = dbUtil.findAllStudents();
		System.out.println(studentList);
//		studentList.stream().forEach(val ->
//	    {
//			try {
//				response.getWriter().append("<h1>" + val + "</h1>\n");
//			} catch (IOException e) {
//				
//				e.printStackTrace();
//			}
//		});

		request.setAttribute("studentlist", studentList);

//		RequestDispatcher rds = request.getRequestDispatcher("/studentList.jsp");
//		rds.forward(request, response); 

	}

	private void loadStudent(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("id=" + id);
		Student student = dbUtil.findStudentById(id);
		System.out.println("Load Data" + student);

//		dbUtil.addStudent(student);
		request.setAttribute("theStudent", student);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/update-student-form.jsp");
		dispatcher.forward(request, response);
	}

	private void searchStudent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		String value = request.getParameter("value");
		String searchBy = request.getParameter("searchBy");
		System.out.println("upcomming value" + value);
		System.out.println("upcomming type " + searchBy);
		while (value != null && searchBy != null) {
			List<Student> studentList = dbUtil.searchStudents(searchBy, value);
			System.out.println("upcomming value from databasee" + studentList);
//		System.out.println(studentList);
			request.setAttribute("studentlist", studentList);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/studentList.jsp");
			dispatcher.forward(request, response);
		}
	}

	private void deleteStudent(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		int id = Integer.parseInt(request.getParameter("id"));
//		System.out.println("id=" + id);
		dbUtil.deleteStudent(id);
		response.sendRedirect(request.getContextPath() + "/StudentController");
	}

	private void updateStudent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		int id = Integer.parseInt(request.getParameter("id"));
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String email = request.getParameter("email");
		Student st = new Student(id, firstName, lastName, email);
		System.out.println("Update data: " + st);
		dbUtil.updateStudent(st);
		response.sendRedirect(request.getContextPath() + "/StudentController");
	}

	private void addStudent(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {

		String fName = request.getParameter("fname");
		String lName = request.getParameter("lname");
		String email = request.getParameter("email");
		Student student = new Student(fName, lName, email);
		dbUtil.addStudent(student);

//	  request.setAttribute("studentlist", studentList);

		response.sendRedirect(request.getContextPath() + "/studentList.jsp");

	}

	private void listStudent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Student> studentList = dbUtil.findAllStudents();
		System.out.println(studentList);
//		studentList.stream().forEach(val ->
//	    {
//			try {
//				response.getWriter().append("<h1>" + val + "</h1>\n");
//			} catch (IOException e) {
//				
//				e.printStackTrace();
//			}
//		});

		request.setAttribute("studentlist", studentList);

		RequestDispatcher rds = request.getRequestDispatcher("/studentList.jsp");
		rds.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}

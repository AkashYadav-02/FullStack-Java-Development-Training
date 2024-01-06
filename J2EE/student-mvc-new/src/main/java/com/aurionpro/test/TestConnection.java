package com.aurionpro.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/TestConnection")
public class TestConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Resource(name = "jdbc/student-source")
	private DataSource dataSource;

	public TestConnection() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet resultSet = null;

		try {
			conn = dataSource.getConnection();
			String sql = "select * from student";
			stmt = conn.createStatement();
			resultSet = stmt.executeQuery(sql);
			
			while(resultSet.next()) {
//				String email = resultSet.getString("email");
				String firstName = resultSet.getString("first_name");
				String lastName = resultSet.getString("last_name");
				String email = resultSet.getString("email");
				System.out.println(email);
				response.getWriter().append("<h1>"+firstName+" "+ lastName+" "+email+" </h1>"+"\n");
			}
//			response.getWriter().append(resultSet.getString("email");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

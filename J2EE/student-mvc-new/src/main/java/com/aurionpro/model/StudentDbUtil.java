package com.aurionpro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class StudentDbUtil {

	private DataSource dataSource;

	public StudentDbUtil(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		ResultSet resultSet = null;

		List<Student> studentList = new ArrayList<Student>();

		try {
			conn = dataSource.getConnection();
			String sql = "select * from student";
			stmt = conn.createStatement();
			resultSet = stmt.executeQuery(sql);

			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String firstName = resultSet.getString("first_name");
				String lastName = resultSet.getString("last_name");
				String email = resultSet.getString("email");

				Student tempStudent = new Student(id, firstName, lastName, email);
				studentList.add(tempStudent);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return studentList;
	}

	public void addStudent(Student student) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = dataSource.getConnection();
			String sql = "INSERT INTO student (first_name, last_name,email) VALUES (?, ?,?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, student.getFirstName());
			stmt.setString(2, student.getLastName());
			stmt.setString(3, student.getEmail());

			stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, stmt, null);
		}
	}

	public void close(Connection conn, Statement stmt, ResultSet resultSet) throws SQLException {
		if (conn != null) {
			conn.close();
		}
		;
		if (stmt != null) {
			stmt.close();
		}
		;
		if (resultSet != null) {
			resultSet.close();
		}
		;

	}

	public Student findStudentById(int id) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet resultSet = null;
		Student student = new Student();

//		List<Student> studentList = new ArrayList<Student>();

		try {
			conn = dataSource.getConnection();
			String sql = "select * from student where id=?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			resultSet = stmt.executeQuery();

			if (resultSet.next()) {
				int id1 = resultSet.getInt("id");
				String firstName = resultSet.getString("first_name");
				String lastName = resultSet.getString("last_name");
				String email = resultSet.getString("email");

				Student tempStudent = new Student(id1, firstName, lastName, email);
				return tempStudent;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	public void updateStudent(Student st) throws SQLException {
		// TODO Auto-generated method stub

		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = dataSource.getConnection();
			String sql = "update student set first_name = ?, last_name= ?, email= ? where (id = ?)";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(4, st.getId());
			stmt.setString(1, st.getFirstName());
			stmt.setString(2, st.getLastName());
			stmt.setString(3, st.getEmail());

			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(conn, stmt, null);
		}

//		System.out.println("Student Details");
//		System.out.println(st);
	}

	public void deleteStudent(int id) throws SQLException {
		// TODO Auto-generated method stub

		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = dataSource.getConnection();
			String sql = "delete from student where id = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);

			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(conn, stmt, null);
		}

//		System.out.println("Student Details");
//		System.out.println(st);
	}

	public List<Student> searchStudents(String searchBy, String value) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet resultSet = null;

		List<Student> studentList = new ArrayList<Student>();

		try {
			conn = dataSource.getConnection();
			System.out.println(searchBy);
			String sql = "select * from student where " + searchBy + "=?";
			stmt = conn.prepareStatement(sql);
			// stmt.setString(1, searchBy);
			stmt.setString(1, value);
			resultSet = stmt.executeQuery();

			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String first_Name = resultSet.getString("first_name");
				String last_Name = resultSet.getString("last_name");
				String email = resultSet.getString("email");

				Student tempStudent = new Student(id, first_Name, last_Name, email);
				studentList.add(tempStudent);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			close(conn, stmt, resultSet);
		}
		return studentList;
	}

}

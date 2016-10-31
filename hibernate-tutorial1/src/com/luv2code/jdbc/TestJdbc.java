package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {

	public static void main(String[] args) {
		String jdbcUrl =  "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		
		String user = "hbstudent";
		String pass = "hbstudent";
		try {
			System.out.println("Connecting to database " + jdbcUrl);
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connections successfull");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

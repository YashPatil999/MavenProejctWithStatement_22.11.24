package com.yp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {

	public static void main(String[] args) throws Exception {

		Student s = new Student();
		s.Insert();
		s.Update();
		s.Delete();
		s.fetchAllData();
	}

	public void Insert() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Studentv2?useSSL=false", "root",
				"root");
		Statement stmt = conn.createStatement();
		String query = "INSERT INTO studentdetails VALUES(101,'yash',25)";
		stmt.executeUpdate(query);
		System.out.println("Data Added Successfully....");
		conn.close();
	}

	public void Update() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Studentv2?useSSL=false", "root",
				"root");
		Statement stmt = conn.createStatement();

		String query = "UPDATE studentdetails SET sname='shubham', sage=27 where sid=101";
		stmt.executeUpdate(query);

		System.out.println("Data Updated Successfully....");
		conn.close();
	}

	public void Delete() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Studentv2?useSSL=false", "root",
				"root");
		Statement stmt = conn.createStatement();

		String query = "DELETE FROM studentdetails WHERE sid=101";
		stmt.executeUpdate(query);

		System.out.println("Data Deleted Successfully....");
		conn.close();
	}

	public void fetchAllData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Studentv2?useSSL=false", "root",
				"root");
		Statement stmt = conn.createStatement();

		String query = "SELECT * FROM studentdetails";
		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {
			System.out.println("SId = " + rs.getInt(1) + "\nSName = " + rs.getString(2) + "\nSAge = " + rs.getInt(3)
					+ "\n=======================");
		}
		conn.close();
	}
}

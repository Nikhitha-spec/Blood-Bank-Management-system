package com.BloodBank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestBlood {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","@nikhitha6660")) {
		}
		System.out.println("Connection created");

	}

}

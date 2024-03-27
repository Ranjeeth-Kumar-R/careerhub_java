package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class DBConnection {
 
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
 
		Connection con = null;
 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
 
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "RacxRK");
		} catch (SQLException e) {
			e.printStackTrace();
		}
 
		return con;
 
	}
 
}

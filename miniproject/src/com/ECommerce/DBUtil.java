package com.ECommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getCon() {
		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/ecommerce";
			String user = "root";
			String password = "9419667240@aK";

			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return con;

	}
	

}

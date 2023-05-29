package com.ECommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Product_Input {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/ecommerce";
			String user = "root";
			String password = "9419667240@aK";

			con = DriverManager.getConnection(url, user, password);

			String query = "Insert into products values \r\n" + "(?,?,?,?,?);";

			pst = con.prepareStatement(query);

			Scanner sc = new Scanner(System.in);
			System.out.println("How Many inputs you want to Enter");
			int TotalInput = sc.nextInt();

			for (int i = 0; i <= TotalInput - 1; i++) {

				System.out.println("Enter Product Id");
				int PId = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Product Name");
				String PName = sc.nextLine();
				
				System.out.println("Enter Product Description");
				String Pdescription = sc.nextLine();
				System.out.println("Enter Available Qty");
				int AvailQty = sc.nextInt();
				System.out.println("Enter Product Price");
				int PPrice = sc.nextInt();

				pst.setInt(1, PId);
				pst.setString(2, PName);
				pst.setNString(3, Pdescription);
				pst.setInt(4, AvailQty);
				pst.setInt(5, PPrice);
				
				int i1;
				i1 = pst.executeUpdate();
				System.out.println(i1 + " Rows Inserted Succesfully");
			}
		} catch (SQLException | ClassNotFoundException e) {

			e.printStackTrace();
		} finally {

			try {
				if (con != null || pst != null) {
					con.close();
					pst.close();
				}
			} catch (SQLException e) {

				e.printStackTrace();

			}
		}

	}
}




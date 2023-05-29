package com.ECommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewProduct {
	public static void viewProduct() {
		Connection con =DBUtil.getCon();
		String query = "SELECT * FROM ecommerce.products;";
		ResultSet rs = null;
		PreparedStatement pst = null;
		try {
			pst = con.prepareStatement(query);
			rs = pst.executeQuery();
			System.out.println("Available Products");
			
			while(rs.next()) {
				System.out.println("Product Id          >> "+rs.getInt(1));
				System.out.println("Product Name        >> "+rs.getString(2));
				System.out.println("Product Description >> "+rs.getString(3));
				System.out.println("Available Qty       >> "+rs.getInt(4));
				System.out.println("Available Price     >> "+rs.getInt(5));
				System.out.println(" ");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {

			try {
				if (con != null || pst != null || rs != null) {
					con.close();
					pst.close();
					rs.close();
				}
			} catch (SQLException e) {

				e.printStackTrace();

			}
		}
	}

}




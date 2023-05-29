package com.ECommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductUpdate {
	public static void main(String[] args) {
		Connection con = DBUtil.getCon();
		PreparedStatement pst = null;
		String query = "update products set p_name = ?, P_Description = ? where P_Id = ?;";
		try {
			pst = con.prepareStatement(query);
			pst.setString(1, "Monitor");
			pst.setString(2, "LG Monitor");
			pst.setInt(3, 4);
			int i = pst.executeUpdate();
			System.out.println(i+" Row Updated Successfully");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				if(con != null || pst!= null) {
					con.close();
					pst.close();
				}
				}catch (SQLException e) {
					e.printStackTrace();
				
			}
		}
	}

}

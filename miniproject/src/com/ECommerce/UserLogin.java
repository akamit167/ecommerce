package com.ECommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Comparator;
import java.util.Scanner;

public class UserLogin {
	public static void userlogin() {
		Connection con = DBUtil.getCon();
		String query = "select * from userreg where username = ? and password = ?";
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Username");
			String username = sc.next();
			System.out.println("Enter your Password");
			String pass = sc.next();	
			pst = con.prepareStatement(query);
			//pst.setString(1, username);
			//pst.setString(2, pass);
			rs = pst.executeQuery();
			
			
			if(rs!=null) {
			System.out.println("Welcome");
			}else {
				System.out.println("Invalid Credentials");
			}
			/*Comparator<String> com = new Comparator<String>() {
				public int compare(username, dbusername) {
					return 0;
					
				}
			};
			while(rs.next()) {
			if(username == rs.getString(1)|| pass == rs.getString(2)) {
			System.out.println("Welcome "+rs.getString(3));
			}else {
				System.out.println("Invalid Credentials");
			}
			}*/
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}

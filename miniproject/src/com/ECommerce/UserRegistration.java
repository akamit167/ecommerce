package com.ECommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserRegistration {
	public static void userRegistration() {
		Connection con = DBUtil.getCon();
		String query = "insert into userreg values\r\n" + 
				"(?,?,?,?,?,?,?);";
		PreparedStatement pst = null;
		try {
			pst = con.prepareCall(query);
			Scanner sc = new Scanner(System.in);
			System.out.println("User Registration");
			System.out.println("Enter Username");
			String userinput = sc.next();
			System.out.println("Enter Password");
			String Pass = sc.next();
			sc.nextLine();
			System.out.println("Enter First Name");
			String First_Name = sc.next();
			
			System.out.println("Enter Last Name");
			String Last_Name = sc.next();
			System.out.println("Enter City");
			String City = sc.next();
			System.out.println("Enter Email Id");
			String Email_id = sc.next();
			System.out.println("Enter Mobile Number");
			long mob_no = sc.nextLong();

			pst.setString(1, userinput);
			pst.setString(2, Pass);
			pst.setString(3, First_Name);
			pst.setString(4, Last_Name);
			pst.setString(5, City);
			pst.setString(6, Email_id);
			pst.setLong(7, mob_no);
			
			
			int i;
			i = pst.executeUpdate();
			System.out.println(i + " Rows Inserted Succesfully");
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}

package com.ECommerce;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Admin {
	public static void main(String[] args) {
		System.out.println("Enter Your Choice \n 1). User Registration \n 2). User Login \n 3). User view Product item as Sorted Order \n 4). Buy Product \n 5). View Cart \n 6). Purchase the item");
		Scanner sc = new Scanner(System.in);
		int choice1 = sc.nextInt();
		switch (choice1) {
		case 1 : UserRegistration.userRegistration();
		break;
		case 2 : UserLogin.userlogin();
		break;
		case 3 : ViewProduct.viewProduct();
		break;
		//case 4 : Division();
		//break;
		//case 5 : Modulus();
		//break;
		//case 6 : Square();
		//break;
		
		default : System.out.println("Invalid Input");
		}
	}

}

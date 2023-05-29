package com.ECommerce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UserInputDetails {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username>>>");
		String username = sc.next();
		System.out.println("Enter Password>>>");
		String password = sc.next();

		/*ArrayList<Username_Password> list = new ArrayList<>();
		list.add(new Username_Password(username, password));

		Collections.sort(list, new UsernameComparator());
		System.out.println(username + " " + password);*/

		sc.close();
	}

}

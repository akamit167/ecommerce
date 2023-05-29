package com.ECommerce;

import java.util.Comparator;

public class PasswordComparator implements Comparator<Username_Password> {

	public static void main(String[] args) {

	}

	
	public int compare(Username_Password p1, Username_Password p2) {
		return p1.getPassword().compareTo(p2.getPassword());
	}

}
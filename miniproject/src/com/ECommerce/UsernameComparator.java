package com.ECommerce;
import java.util.Comparator;


	

	public class UsernameComparator implements Comparator<Username_Password> {

		public static void compareUser {

		}

		
		public int compare(Username_Password u1, Username_Password u2) {
			return u1.getUsername().compareTo(u2.getUsername());
		}

	}




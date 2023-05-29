package com.ECommerce;

public class Username_Password {
	

		private String username;
		private String password;

		public Username_Password() {
			super();
		}

		public Username_Password(String username, String password) {
			super();
			this.username = username;
			this.password = password;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		
		public String toString() {
			return "UserName [username=" + username + ", password=" + password + "]";
		}

	}




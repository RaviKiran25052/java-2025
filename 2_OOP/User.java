public class User {
	String username = "user";
	String email = "not provided";
	String password = "user123";

	void login() {
		System.out.println(username + " is logged in!");
	}

	void logout() {
		System.out.println(username + " is logged out!");
	}

	// Constructor
	User(String u, String e, String p) {
		username = u;
		email = e;
		password = p;
	}

	// constructor overloading
	User(String u, String e) {
		username = u;
		email = e;
	}
}

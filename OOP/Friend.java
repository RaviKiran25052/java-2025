public class Friend {
	
	static int noOfFriends;
	String name;

	Friend(String name) {
		this.name = name;
		noOfFriends++;
	}

	static void play() {
		System.out.println("Playing with " + noOfFriends + " friends");
	}
}

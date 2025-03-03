public class _1_Static {
   @SuppressWarnings("static-access") // to avoid warning with static variable (optional)
	public static void main(String[] args) {
		
		Friend friend1 = new Friend("Gopika");
		Friend friend2 = new Friend("Ravi");
		Friend friend3 = new Friend("Partha");
		
		// static variable
		System.out.println("\nStatic variable:");
		System.out.println("No of Friends: " + Friend.noOfFriends); // direct use of class name
		// same as
		System.out.println("\nNo of Friends: " + friend1.noOfFriends); // use of object reference
		System.out.println("No of Friends: " + friend2.noOfFriends); // use of object reference
		System.out.println("No of Friends: " + friend3.noOfFriends); // use of object reference

		// static method
		System.out.println("\nStatic method:");
		Friend.play();
	}
}

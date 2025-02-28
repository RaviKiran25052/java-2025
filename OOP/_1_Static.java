public class _1_Static {
	
	public static void main(String[] args) {
		
		Friend friend1 = new Friend("Gopika");
		Friend friend2 = new Friend("Ravi");
		Friend friend3 = new Friend("Partha");
		
		// static variable
		System.out.println("\nStatic variable:");
		System.out.println("No of Friends: " + Friend.noOfFriends); // direct use of class name
		
		// static method
		System.out.println("\nStatic method:");
		Friend.play();
	}
}

public class _4_Statements {
	public static void main(String[] args) {
		
		// if-else
		int x = 10;
		if (x > 5) {
			System.out.println("\nif: x is greater than 5");
		} else if (x == 5) {
			System.out.println("else if: x is equal to 5");
		} else {
			System.out.println("else: x is less than or equal to 5");
		}
		
		// ternary operator
		int a = 5;
		int b = 10;
		int max = (a > b) ? a : b;
		System.out.println("greatest among "+ a + " and " + b +" : " + max);

		// switch-case
		int y = 2;
		switch (y) {
			case 1 -> System.out.println("switch-case: y is 1");
			case 2 -> System.out.println("switch-case: y is 2");
			default -> System.out.println("switch-case: y is neither 1 nor 2");
		}

		// deprecated switch-case
		// int day = 1;
		// switch (day) {
		// 	case 1:
		// 		System.out.println("\nIt's Monday");
		// 		break;
		// 	case 2:
		// 		System.out.println("It's Tuesday");
		// 		break;
		// 	case 3:
		// 		System.out.println("It's Wednesday");
		// 		break;
		// 	case 4:
		// 		System.out.println("It's Thursday");
		// 		break;
		// 	case 5:
		// 		System.out.println("It's Friday");
		// 		break;
		// 	case 6:
		// 		System.out.println("It's Saturday");
		// 		break;
		// 	case 7:
		// 		System.out.println("It's Weekend");
		// 		break;
		// 	default:
		// 		System.out.println("Invalid day");
		// 		break;
		// }
		
	}
}

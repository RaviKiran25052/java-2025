public class _5_Loops {
	public static void main(String[] args) {
		
		// for loop
		for (int i = 0; i < 5; i++) {
			System.out.println("for loop: " + i);
		}
		int a = 0;
		for (; a < 5;) {
			System.out.println("for loop as while: " + a);
			a++;
		}
		
		// infinite loop
		// for (;;) {
		// 	System.out.println("infinite loop");
		// }
		
		// while loop
		int j = 0;
		while (j < 5) {
			System.out.println("while loop: " + j);
			j++;
		}
		
		// do-while loop
		int k = 0;
		do {
			System.out.println("do-while loop: " + k);
			k++;
		} while (k < 5);
		
		// nested loop
		for (int i = 0; i < 3; i++) {
			for (int l = 0; l < 3; l++) {
				System.out.println("nested loop: " + i + ", " + l);
			}
		}
		
		// break statement
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println("break statement: " + i);
		}
		
		// continue statement
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println("continue statement: " + i);
		}
		
		// labeled break statement
		outer: for (int i = 0; i < 3; i++) {
			for (int l = 0; l < 3; l++) {
				if (l == 2) {
					break outer;
				}
				System.out.println("labeled break statement: " + i + ", " + l);
			}
		}
		
		// labeled continue statement
		outer: for (int i = 0; i < 3; i++) {
			for (int l = 0; l < 3; l++) {
				if (l == 2) {
					continue outer;
				}
				System.out.println("labeled continue statement: " + i + ", " + l);
			}
		}
	}
}

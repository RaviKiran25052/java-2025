public class _2_Literals {
	public static void main(String[] args) {
		
		char c = 'A'; // 65
		System.out.println("\n'A': " + c);
		c++;
		System.out.println("'A' + 1: " + c);

		int i = 1_00_00_000; // 10000000
		System.out.println("\n1_00_00_000: " + i);

		float f = 1.234_567_89f; // 1.23456789
		System.out.println("1.234_567_89f: " + f);

		double p = 12e5; // 12 * 10^5
		System.out.println("12e5: " + p);

		// base 10
		int i1 = 101;
		System.out.println("\nbase 10: " + i1);

		// base 2
		int i2 = 0b101;
		System.out.println("base 2: " + i2);

		// base 8
		int i3 = 0101;
		System.out.println("base 8: " + i3);

		// base 16
		int i4 = 0x101;
		System.out.println("base 16: " + i4);

	}
}

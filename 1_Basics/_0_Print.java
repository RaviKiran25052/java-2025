public class _0_Print {
	public static void main(String[] args) {
		
		// println() method
		System.out.println("\nprintln() method! with new line\\n");
		
		// print() method
		System.out.print("print() method! without new line\\n");

		// printf() method - %[flags][width][.precision]conversion-character
		// %[flags] = # 0 - , + ( space
		// # - used with o, x, X to include 0, 0x, 0X prefix like padding with leading zeros
		int i = 65;
		int j = -65;
		int k = 1234567;
		System.out.printf("\nHexadecimal with prefix: %#x", i);
		// 0 - pads the output with leading zeros
		System.out.printf("\nPadded with leading zeros: %05d", i);
		// - - left-justifies the output
		System.out.printf("\nLeft-justified: %-1d", i);
		// ' ' - adds a space before positive numbers
		System.out.printf("\nSpace before positive number: % d", i);
		System.out.printf("\nNo Space before negative number: % d", j);
		// + - adds a plus sign before positive numbers
		System.out.printf("\nPlus sign before positive number: %+d", i);
		System.out.printf("\nMinus sign before negative number: %+d", j);
		// , - adds a comma for thousands separator
		System.out.printf("\nNumber with comma separator: %,d", k);
		// ( - encloses negative numbers in parentheses
		System.out.printf("\nNegative number in parentheses: %(d", j);
		// %[width] - minimum number of characters to be written as output
		System.out.printf("\nMinimum width: %5d", i);
		// %[.precision] - sets number of digits of precision when outputting floating-point values
		// %[conversion-character] - d, f, s, c, b
		char a = 'A';
		int b = 65;
		boolean c = true;
		double d = 3.143;
		System.out.printf("\n\nCharacter: %c", a);
		System.out.printf("\nInteger: %d", b);
		System.out.printf("\nBoolean: %b", c);
		System.out.printf("\nDouble: %f", d);
		System.out.printf("\n\nDouble with 2 decimal places: %.2f\n", d);
	}
}

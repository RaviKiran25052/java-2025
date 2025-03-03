public class _3_TypeCasting {
	
	public static void main(String[] args) {
		
		// type conversion
		byte b = 120;
		int i = b; // no explicit type casting required
		System.out.println("int i: " + i);

		// type casting
		int p = 257; // 257 % 256 = 1, so byte value is 1 (because byte range is -128 to 127)
		int q = 128; // 128 % 256 = -128 (due to overflow in byte range)
		byte j = (byte)q; // explicit type casting required
		byte k = (byte)p; // explicit type casting required
		System.out.println("(byte) j: " + j);		
		System.out.println("(byte) k: " + k);

		// byte range: -2^7 to 2^7 - 1 = 256 values
		// short range: -2^15 to 2^15 - 1 = 65536 values
		// int range: -2^31 to 2^31 - 1 = 4294967296 values
		// long range: -2^63 to 2^63 - 1 = 18446744073709551616 values
		// float range: 2^-149 to 2^128
		// double range: 2^-1074 to 2^1024
		// char range: 0 to 2^16 - 1 = 65536 values
		// boolean values: true or false
		
		// type promotion
		byte x = 10;
		byte y = 20;
		int z = (int)(x * y); // explicit type casting required
		System.out.println("(byte) z: " + z);
		
		// byte -> short -> int -> long -> float -> double
		// char -> int -> long -> float -> double
		
		// byte, short, char, int, long, float, double can be promoted to double
		// byte, short, char, int, long can be promoted to float
		// byte, short, char, int can be promoted to long
		// byte, short, char can be promoted to int
		// byte, short can be promoted to char
		// byte can be promoted to short
	}
}

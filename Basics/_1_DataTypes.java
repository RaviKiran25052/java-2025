
class _1_DataTypes {
	public static void main(String[] args) {

		byte by1 = -128;
		byte by2 = 127;
		short s1 = -32768;
		short s2 = 32767;
		int i1 = -2147483648;
		int i2 = 2147483647;
		long l1 = -9223372036854775808L;
		long l2 = 9223372036854775807L;
		float f1 = -3.4028235E38f; // 6 to 7 decimal digits
		float f2 = 3.4028235E38f;
		double d1 = -1.7976931348623157E308; // 15 to 16 decimal digits
		double d2 = 1.7976931348623157E308;
		char c1 = 0;
		char c2 = 65535;
		char c3 = 'A';
		char c4 = '$';
		boolean b1 = false;
		boolean b2 = true;

		System.out.println("\nbyte range: " + by1 + " to " + by2);
		System.out.println("short range: " + s1 + " to " + s2);
		System.out.println("int range: " + i1 + " to " + i2);
		System.out.println("long range: " + l1 + " to " + l2);
		System.out.println("float range: " + f1 + " to " + f2);
		System.out.println("double range: " + d1 + " to " + d2);
		System.out.println("char range: " + (int)c1 + " to " + (int)c2);
		System.out.println("char examples: " + c3 + ", " + c4);
		System.out.println("boolean values: " + b1 + ", " + b2);
		
	}
}
public class _7_WrapperClasses {
	public static void main(String[] args) {

		// wrapper classes - allows primitive datatypes to be used as objects
		// which allows to use for Collection framework or staitic utility methods

		// int a = 10; instead of
		// Integer i = new Integer(10); // deprecated

		// Autoboxing
		Integer i1 = 10;
		Double d1 = 3.14;
		Character c1 = '%';
		Boolean b1 = true;

		// Unboxing
		int i2 = i1;
		double d2 = d1;
		char c2 = c1;
		boolean b2 = b1;

		// converting to strings
		String a = Integer.toString(i2);		// "10"
		String b = Double.toString(d2);		// "3.14"
		String c = Character.toString(c2);	// "%"
		String d = Boolean.toString(b2);		// "true"

		String x = a + b + c + d;
		System.out.println(x);

		// parsing - converting to respective datatypes
		int p = Integer.parseInt(a);
		double q = Double.parseDouble(b);
		// char r = Character.parseCharcter(c); // didn't have a parse method
		boolean s = Boolean.parseBoolean(d);

		// to check the datatype we can use the .getClass().getName()
		// but only used for objects, so type casting to objects
		System.out.println("\ndatatype of p: " + ((Object)p).getClass().getName());
		System.out.println("datatype of q: " + ((Object)q).getClass().getName());
		System.out.println("datatype of s: " + ((Object)s).getClass().getName());

		System.out.println();

		System.out.println(Character.isLetter('#'));
		System.out.println(Character.isUpperCase('B'));
		System.out.println(Character.isAlphabetic('a'));
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isDigit('2'));
	}
}
public class _7_String {
	public static void main(String[] args) {
		
		// String
		String str = "Hello, World!";
		System.out.println(str);
		
		// String length
		System.out.println("\nLength of the string: " + str.length());
		
		// String concatenation
		String str1 = "Ravi ";
		String str2 = "Kiran";
		String str3 = str1 + str2;
		System.out.println("\nstr1 + str2: " + str3);
		
		// String comparison
		String str4 = "Java Strings";
		String str5 = "Java Strings";
		String str6 = "java strings";
		System.out.println("\nstr4 equals str5: " + str4.equals(str5));
		System.out.println("str4 equals str6: " + str4.equals(str6));
		System.out.println("str4 equalsIgnoreCase str6: " + str4.equalsIgnoreCase(str6));
		
		// String comparison - compareTo()
		String str7 = "Compares with UNICODE";
		String str8 = "Compares with UNICODE";
		String str9 = "Compares with uNICODE";
		System.out.println("\nstr7 compareTo str8: " + str7.compareTo(str8));
		System.out.println("str7 compareTo str9: " + str7.compareTo(str9));
		
		// String comparison - compareToIgnoreCase()
		String str10 = "Compares UNICODE without case sensitivity";
		String str11 = "compares unicode without case sensitivity";
		System.out.println("\nstr10 compareToIgnoreCase str11: " + str10.compareToIgnoreCase(str11));
		
		// String comparison - startsWith()
		String str12 = "Main String";
		String str13 = "Main";
		String str14 = "main";
		System.out.println("\nstr12 startsWith str13: " + str12.startsWith(str13));
		System.out.println("str12 startsWith str14: " + str12.startsWith(str14));
		
		// String comparison - endsWith()
		String str15 = "my word";
		String str16 = "my";
		String str17 = "word";
		System.out.println("\nstr15 endsWith str16: " + str15.endsWith(str16));
		System.out.println("str15 endsWith str17: " + str15.endsWith(str17));
		
		// String comparison - contains()
		String str18 = "is there";
		String str19 = "is";
		String str20 = "their";
		System.out.println("\nstr18 contains str19: " + str18.contains(str19));
		System.out.println("str18 contains str20: " + str18.contains(str20));

		// String comparison - indexOf()
		String str21 = "one by one";
		String str22 = "one";
		String str23 = "two";
		System.out.println("\nstr21 indexOf str22: " + str21.indexOf(str22));
		System.out.println("str21 indexOf str23: " + str21.indexOf(str23));

		// String comparison - lastIndexOf()
		String str24 = "day by day";
		String str25 = "day";
		String str26 = "week!";
		System.out.println("\nstr24 lastIndexOf str25: " + str24.lastIndexOf(str25));
		System.out.println("str24 lastIndexOf str26: " + str24.lastIndexOf(str26));

		// String comparison - charAt()
		String str27 = "characters";
		System.out.println("\nstr27 charAt 0: " + str27.charAt(0));
		System.out.println("str27 charAt 7: " + str27.charAt(7));

		// String comparison - substring()
		String str28 = "mySubString";
		System.out.println("\nstr28 substring 0-5: " + str28.substring(0, 5));
		System.out.println("str28 substring 7-10: " + str28.substring(7, 10));

		// String formatting - toLowerCase()
		String str29 = "my UPPERCASE";
		System.out.println("\nstr29 toLowerCase: " + str29.toLowerCase());

		// String formatting - toUpperCase()
		String str30 = "my lowercase";
		System.out.println("\nstr30 toUpperCase: " + str30.toUpperCase());

		// String formatting - trim()
		String str31 = "  removes spaces around but not UNICODE spaces '\\u2000'.  ";
		System.out.println("\nstr31 trim: " + str31.trim());

		// String formatting - replace()
		String str32 = "replace ME";
		System.out.println("\nstr32 replace: " + str32.replace("ME", "YOU"));

		// String formatting - split()
		String str33 = "split, this";
		String[] str34 = str33.split(",");
		System.out.println("\nstr33 split: " + str34[0] + str34[1]);

		// String conversion - valueOf() - explicit conversion
		int a = 65000;
		boolean b = true;
		char c = 'A';
		double d = 3.143;
		System.out.println("\nString valueOf int: " + String.valueOf(a));
		System.out.println("String valueOf boolean: " + String.valueOf(b));
		System.out.println("String valueOf char: " + String.valueOf(c));
		System.out.println("String valueOf double: " + String.valueOf(d));

		// String formatting - format()
		System.out.println("\nString format int: " + String.format("%,d", a));
		System.out.println("String format double: " + String.format("%f", d));
		System.out.println("String format boolean: " + String.format("%b", b));
		System.out.println("String format char: " + String.format("%c", c));
		System.out.println("String format with 2 decimal places: " + String.format("%.2f", d));

		// String formatting - join()
		String str35 = String.join(", ", "join", "me!");
		System.out.println("\nstr35 join: " + str35);

		// String comparison - isEmpty()
		String str36 = "";
		String str37 = " ";
		String str38 = "Im not empty!";
		System.out.println("\nstr36 isEmpty: " + str36.isEmpty());
		System.out.println("str37 isEmpty: " + str37.isEmpty());
		System.out.println("str38 isEmpty: " + str38.isEmpty());

		// String comparison - isBlank()
		String str39 = "";
		String str40 = " ";
		String str41 = "Im not blank!";
		System.out.println("\nstr39 isBlank: " + str39.isBlank());
		System.out.println("str40 isBlank: " + str40.isBlank());
		System.out.println("str41 isBlank: " + str41.isBlank());

		// String formatting - strip()
		String str42 = "  removes spaces around even UNICODE.  ";
		String str43 = "\u2000removes spaces around.\u2000";
		System.out.println("\nstr42 strip: " + str42.strip());
		System.out.println("str43 strip: " + str43.strip());

		// String formatting - repeat()
		String str44 = " me!";
		System.out.println("str44 repeat:" + str44.repeat(3));

		// String comparison - matches()
		String str45 = "should be exact match";
		System.out.println("\nstr45 matches: " + str45.matches("should be exact match"));

		// String comparison - toCharArray()
		String str46 = "you and i";
		char[] str47 = str46.toCharArray();
		System.out.println("\nstr46 toCharArray: " + str47[2] + " & " + str47[8]);

		// String comparison - getBytes() - ASCII
		String str48 = "Aello, World!";
		byte[] byarr = str48.getBytes();
		System.out.println("\nstr48 getBytes: " + byarr[0] + ", " + byarr[7]);
	}
}

public class _1_Reversing {
	public static void main(String[] args) {

		// Reversing Integer
		int num = 1234;
		System.out.println("\nNumber before Reversing: " + num);

		int revInt = 0;
		while (num != 0) {
			revInt = revInt * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Number after Reversing: " + revInt);

		// Reversing String using Concatenation
		String str1 = "ravi";
		System.out.println("\nString before Reversing: " + str1);

		int n1 = str1.length();
		String revStr1 = "";
		for(int i = n1 - 1; i >= 0; i--) {
			revStr1 = revStr1 + str1.charAt(i);
		}
		System.out.println("String after Reversing: " + revStr1);

		// Reversing String using Array
		String str2 = "kiran";
		System.out.println("\nString before Reversing: " + str2);

		char[] arr = str2.toCharArray(); // ['k','i','r','a','n']
		int n2 = arr.length;
		String revStr2 = "";
		for(int i = n2 - 1; i >= 0; i--) {
			revStr2 = revStr2 + arr[i];
		}
		System.out.println("String after Reversing: " + revStr2);

		// Reversing String using String Builder
		String str3 = "varma";
		System.out.println("\nString before Reversing: " + str3);
		StringBuilder sb = new StringBuilder(str3);
		System.out.println("String after Reversing: " + sb.reverse());
	}
}

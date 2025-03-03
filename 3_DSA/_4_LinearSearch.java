public class _4_LinearSearch {
	public static void main(String[] args) {

		int[] arr = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

		int target = 5;
		int found = -1;

		for (int i = 0; i < arr.length; i++) {
			if (target == arr[i]) {
				found = i;
				break;
			}
		}
		if (found != -1) System.out.println(target + " was found at: " + found);
		else System.out.println("404 Not found :(");

		
		// time complexity - O(n)
		// space complexity - O(n)
	}
}

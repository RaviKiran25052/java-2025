public class _5_BinarySearch {
	public static void main(String[] args) {
		
		// should be a sorted array
		int[] arr = new int[10000];
		int target = 7411;

		for (int i = 0; i < arr.length; i++) arr[i] = i + 1;

		int low = 0;
		int high = arr.length;
		int index = -1;

		while(low <= high) {
			int mid = (high + low)/2;
			int value = arr[mid];
			
			if (value < target) low = mid + 1;
			else if (value > target) high = mid - 1;
			else {
				index = mid;
				break;
			}
		}

		if (index != -1) System.out.println(target + " was found at: " + index);
		else System.out.println("404 Not found :(");
		
		// time complexity - O(n)
		// space complexity - O(n log n)
	}
}
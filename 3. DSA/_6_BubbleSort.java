public class _6_BubbleSort {

	static void show(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[] arr = { 8, 5, 7, 3, 2 };
		System.out.print("\nBefore Sorting: ");
		show(arr);

		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}

		System.out.print("After Sorting: ");
		show(arr);

		// time complexity - O(n²)
		// space complexity - O(1)
	}
}

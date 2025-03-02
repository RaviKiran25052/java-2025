public class _3_SelectionSort {

	static void show(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[] arr = { 7, 2, 9, 4, 1 };
		System.out.print("\nBefore Sorting: ");
		show(arr);

		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}

		System.out.print("After Sorting: ");
		show(arr);
		
		// time complexity - O(n²)
		// space complexity - O(1)
	}
}

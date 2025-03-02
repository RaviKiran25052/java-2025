public class _7_InsersionSort {

	static void show(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[] arr = { 6, 4, 7, 3, 1 };
		System.out.print("\nBefore Sorting: ");
		show(arr);

		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) { // j = -1 was not valid
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}

		System.out.print("After Sorting: ");
		show(arr);
		
		// time complexity - O(n²)
		// space complexity - O(1)
	}
}
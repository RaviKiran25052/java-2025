public class _9_MergeSort {

	static void show(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// merging 2 sorted sub arrays
	static void merge(int[] left, int[] right, int[] arr) {
		int i = 0;
		int j = 0;
		int k = 0;

		int m = left.length;
		int n = right.length;
		while (m > i && n > j) {
			if (left[i] < right[j])
				arr[k++] = left[i++];
			else
				arr[k++] = right[j++];
		}
		while (m > i) {
			arr[k++] = left[i++];
		}
		while (n > j) {
			arr[k++] = right[j++];
		}
	}

	// recursively dividing into sub arrays
	static void mergeSort(int[] arr) {
		int n = arr.length;

		if (n != 1) {
			int mid = n / 2;
			int[] left = new int[mid];
			int[] right = new int[n - mid];
				
			System.arraycopy(arr, 0, left, 0, mid);
			System.arraycopy(arr, mid, right, 0, n - mid);
			
			// OR
			// for (int i = 0; i < mid; i++)
			// 	left[i] = arr[i];

			// for (int i = mid; i < n; i++)
			// 	right[i - mid] = arr[i];
			
			mergeSort(left);
			mergeSort(right);
			merge(left, right, arr);
		}
	}

	public static void main(String[] args) {

		int[] arr = { 8, 2, 5, 3, 4, 7, 6, 1 };
		System.out.print("\nBefore Sorting: ");
		show(arr);

		mergeSort(arr);

		System.out.print("After Sorting: ");
		show(arr);

		// time complexity - O(n log n)
		// space complexity - O(n)
	}
}

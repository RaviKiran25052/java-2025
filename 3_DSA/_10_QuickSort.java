public class _10_QuickSort {

	static void show(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	static int partition(int[] arr, int start, int end) {
		int pivot = arr[start]; // Choose first element as pivot
		int i = start + 1, j = end;

		while (i <= j) {
			while (i <= j && arr[i] <= pivot) {
				i++; // index of element greater than pivot
			}
			while (arr[j] > pivot) {
				j--; // index of element less than pivot
			}
			if (i < j) { // j is not yet crossed i
				swap(arr, i, j);
			}
		}

		swap(arr, start, j); // Place pivot in correct position
		return j;
	}

	// recursively partitioning the array after getting the pivot
	static void quickSort(int[] arr, int start, int end) {
		
		if (start >= end) return; // base case

		int pivot = partition(arr, start, end);
		quickSort(arr, start, pivot - 1);
		quickSort(arr, pivot + 1, end);
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 8, 2, 5, 3, 4, 7, 6, 1 };

		System.out.print("\nBefore Sorting: ");
		show(arr);

		quickSort(arr, 0, arr.length - 1);

		System.out.print("After Sorting: ");
		show(arr);

		// time complexity - O(n log n)
		// space complexity - O(log n)
	}
}

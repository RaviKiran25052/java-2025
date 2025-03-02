public class _5_QuickSort {

	static void show(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	static int partition(int[] arr, int low, int high) {
		int pivot = arr[low]; // Choose first element as pivot
		int i = low + 1, j = high;

		while (i <= j) {
			while (i <= j && arr[i] <= pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			if (i < j) {
				swap(arr, i, j);
			}
		}

		swap(arr, low, j); // Place pivot in correct position
		return j;
	}

	// QuickSort with proper range checks
	static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pivot = partition(arr, low, high);
			quickSort(arr, low, pivot - 1);
			quickSort(arr, pivot + 1, high);
		}
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

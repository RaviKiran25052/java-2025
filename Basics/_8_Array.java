import java.util.Arrays;

public class _8_Array {
	public static void main(String[] args) {
		
		// array declaration
		int[] arr1 = new int[5];
		int[] arr2 = { 1, 2, 3, 4, 5 };
		int[] arr3 = new int[] { 1, 2, 3, 4, 5 }; // dynamic size

		// array initialization
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;

		// array length
		System.out.println("\nArray length: " + arr2.length);

		// array elements
		System.out.println("Array elements: " + arr3[0] + ", " + arr3[1] + ", " + arr3[2] + ", " + arr3[3] + ", " + arr3[4]);

		// array iteration
		System.out.print("\nfor loop:");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(" " + arr1[i]);
		}

		// enhanced for loop
		System.out.print("\nEnhanced for loop:");
		for (int i : arr2) {
			System.out.print(" " + i);
		}

		// multi-dimensional array
		int[][] arr4 = new int[2][3];
		int[][] arr5 = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] arr6 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } }; // dynamic initialization

		// multi-dimensional array length
		System.out.println("\n\nMulti-dimensional array length: " + arr4.length);

		// multi-dimensional array elements
		System.out.println("Multi-dimensional array elements: " + arr5[0][0] + ", " + arr5[0][1] + ", " + arr5[0][2] + ", " + arr5[1][0] + ", " + arr5[1][1] + ", " + arr5[1][2]);

		// multi-dimensional array iteration
		System.out.println("\nMulti-dimensional array iteration:");
		for (int i = 0; i < arr6.length; i++) {
			for (int j = 0; j < arr6[i].length; j++) {
				System.out.print(arr6[i][j] + " ");
			}
			System.out.println();
		}

		// multi-dimensional enhanced for loop
		System.out.println("\nMulti-dimensional enhanced for loop:");
		for (int[] i : arr5) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// jagged array - different number of columns in each row
		int[][] arr7 = new int[2][];
		arr7[0] = new int[2]; // 2 columns in 1st row
		arr7[1] = new int[3]; // 3 columns in 2nd row
		arr7[0][0] = 1;
		arr7[0][1] = 2;
		arr7[1][0] = 3;
		arr7[1][1] = 4;
		arr7[1][2] = 5;

		// jagged array length
		System.out.println("\nJagged array length: " + arr7.length);

		// jagged array elements
		System.out.println("Jagged array elements: " + arr7[0][0] + ", " + arr7[0][1] + ", " + arr7[1][0] + ", " + arr7[1][1] + ", " + arr7[1][2]);

		// jagged array iteration
		System.out.println("\nJagged array iteration:");
		for (int i = 0; i < arr7.length; i++) {
			for (int j = 0; j < arr7[i].length; j++) {
				System.out.print(arr7[i][j] + " ");
			}
			System.out.println();
		}

		// jagged array enhanced for loop
		System.out.println("\nJagged array enhanced for loop:");
		for (int[] i : arr7) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// Arrays class methods
		int[] arr8 = { 4, 1, 3, 2, 5 };
		int[] arr9 = { 4, 1, 3, 2, 5 };
		
		// equals
		System.out.println("\nArrays.equals: " + Arrays.equals(arr8, arr9));

		// fill
		Arrays.fill(arr8, 10);
		System.out.print("Arrays.fill: ");
		for (int i : arr8) {
			System.out.print(i + " ");
		}

		// sort
		Arrays.sort(arr9);
		System.out.print("\nArrays.sort: ");
		for (int i : arr9) {
			System.out.print(i + " ");
		}

		// binary search
		System.out.println("\nArrays.binarySearch: " + Arrays.binarySearch(arr9, 3));

		// toString
		System.out.println("Arrays.toString: " + Arrays.toString(arr9));

		// copyOf
		int[] arr10 = Arrays.copyOf(arr9, 3);
		System.out.print("Arrays.copyOf: ");
		for (int i : arr10) {
			System.out.print(i + " ");
		}

		// copyOfRange
		int[] arr11 = Arrays.copyOfRange(arr9, 1, 3);
		System.out.print("\nArrays.copyOfRange: ");
		for (int i : arr11) {
			System.out.print(i + " ");
		}

		// asList
		String[] arr12 = { "Java", "Python", "C++" };
		System.out.println("\nArrays.asList: " + Arrays.asList(arr12));
	}
}

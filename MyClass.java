import java.util.*;

public class MyClass {
	static int Sum(List<Integer> list) {
		int sum = 0;
		for (int ele : list)
			sum += ele;
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int len = sc.nextInt();
		List<Integer> list = new ArrayList<>();

		System.out.println("Enter the elements: ");
		for (int i = 0; i < len; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		System.out.println("All possible combinations with remaining elements:");
		Set<String> uniquePairs = new HashSet<>(); // Store unique pairs
		List<Integer> tempList = new ArrayList<>();
		generateCombinations(list, 0, tempList, uniquePairs);
	}

	public static void generateCombinations(List<Integer> list, int index, List<Integer> tempList, Set<String> uniquePairs) {
		if (!tempList.isEmpty() && tempList.size() < list.size()) {
			// Get remaining elements (without removing all occurrences)
			List<Integer> remaining = new ArrayList<>(list);
			for (Integer num : tempList) {
				remaining.remove(num); // Remove only one occurrence
			}

			if (!remaining.isEmpty()) {
				// Convert to a string key and store in a set
				String pairKey1 = Sum(tempList) + "-" + Sum(remaining);
				String pairKey2 = Sum(remaining) + "-" + Sum(tempList);
				if (!uniquePairs.contains(pairKey1) && !uniquePairs.contains(pairKey2)) {
					uniquePairs.add(pairKey1);
					System.out.println(Sum(tempList) + "-" + Sum(remaining));
					// System.out.println(uniquePairs);
				}
			}
		}

		for (int i = index; i < list.size(); i++) {
			tempList.add(list.get(i));
			generateCombinations(list, i + 1, tempList, uniquePairs);
			tempList.remove(tempList.size() - 1); // Backtrack
		}
	}
}
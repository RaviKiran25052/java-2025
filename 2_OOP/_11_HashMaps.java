
import java.util.HashMap;

public class _11_HashMaps {
	
	// HashMap is a part of the Java Collections Framework, a data structure that stores key-value pairs.
	// It allows for fast retrieval of values based on keys.
	// HashMaps are not synchronized, meaning they are not thread-safe.
	// They allow null values and one null key.

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("apple", 15);
		map.put("banana", 10);
		map.put("orange", 20);
		map.put("kiwi", 5);
		map.put("banana", 12); // This will overwrite the previous value for "banana"

		System.out.println("Contents of map: " + map);
		System.out.println("Size of map: " + map.size());
		System.out.println("Value for 'banana': " + map.get("banana"));
		System.out.println("Does map contain key 'kiwi'? " + map.containsKey("kiwi"));
		System.out.println("Does map contain value 20? " + map.containsValue(20));

		// Removing an entry
		map.remove("kiwi");
		System.out.println("Contents of map after removing 'kiwi': " + map);

		// Iterating over keys
		System.out.println("Keys in map:");
		for (String key : map.keySet()) {
			System.out.println(key);
		}
	}
}

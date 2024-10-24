import java.util.Map.Entry;
import java.util.TreeMap;

public class CountWords {
	public static void main(String[] args) {
		String string = "Hello World I'm Nguyen Thang Thang Thang hello";
		String[] words = string.split(" ");
		TreeMap<String, Integer> map = new TreeMap<>();

		for (String word : words) {
			word = word.toLowerCase();
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}

		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Word: " + entry.getKey() + " - Count: " + entry.getValue());
		}
	}
}

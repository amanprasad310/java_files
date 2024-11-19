import java.util.HashMap;
import java.util.Map;

public class tempiv {
    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 2, 2, 2}; // Corrected array declaration
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1); // Increment value if key exists
            } else {
                map.put(arr[i], 1); // Initialize value to 1
            }
        }

        // Loop through the map and print key-value pairs
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}

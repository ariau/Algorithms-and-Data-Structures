package map.charfrequency;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingChar {

    public static void main(String[] args) {
        findNonRepeatingChar("aabbccfdde");
    }

    private static void findNonRepeatingChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First unique char: " + entry.getKey());
                return;
            }
        }
    }
}

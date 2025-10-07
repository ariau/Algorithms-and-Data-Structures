package map.charfrequency;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println(anagramCheck(s1, s2));
    }

    private static boolean anagramCheck(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        // Count number of the same letter
        for (char c: s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Substract number of the same letter until there's no more = 0. Then, Remove Key.
        for (char c: s2.toCharArray()) {
            if(!map.containsKey(c)) return false;
            map.put(c, map.getOrDefault(c, 0) - 1);
            if(map.get(c) == 0) map.remove(c);
        }

        return map.isEmpty();
    }
}

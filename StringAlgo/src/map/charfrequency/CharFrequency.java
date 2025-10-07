package map.charfrequency;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {

    public static void main(String[] args) {
        getCharFrequency("anagramme");
    }

    private static void getCharFrequency(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c: s.toCharArray()) {
           frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        System.out.println(frequencyMap);
    }
}

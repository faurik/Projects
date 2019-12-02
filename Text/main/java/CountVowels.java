import java.util.Map;
import java.util.TreeMap;

public class CountVowels {
    private static final char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static int countVowels(String in) {
        int count = 0;
        for (char inChar: in.toCharArray()) {
            for (char vowel : vowels) {
                if (inChar == vowel) {
                    count += 1;
                    break;
                }
            }
        }
        return count;
    }

    public static String countVowelsReport(String in) {
        Map<Character, Integer> counters = new TreeMap<>();
        for (char vowel : vowels) counters.put(vowel, 0);
        for (char inChar : in.toCharArray()) {
            if (counters.containsKey(inChar)) counters.put(inChar, counters.get(inChar) + 1);
        }
        return counters.toString();
    }
}

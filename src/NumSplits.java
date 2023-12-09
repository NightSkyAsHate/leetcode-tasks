import java.util.HashMap;
import java.util.Map;

public class NumSplits {

    public static void main(String[] args) {
        System.out.println(numSplits("abcd"));
    }

    public static int numSplits(String s) {
        Map<Character, Integer> wordLetters = new HashMap<>();
        for (char c: s.toCharArray()) {
            if (!wordLetters.containsKey(c)) {
                wordLetters.put(c, 1);
            } else {
                wordLetters.put(c, wordLetters.get(c) + 1);
            }
        }
        Map<Character, Integer> currentLetters = new HashMap<>();
        int sum = 0;
        for (char c: s.toCharArray()) {
            if (!currentLetters.containsKey(c)) {
                currentLetters.put(c, 1);
            } else {
                currentLetters.put(c, currentLetters.get(c) + 1);
            }
            if (wordLetters.get(c) == 1) wordLetters.remove(c);
            else wordLetters.put(c, wordLetters.get(c) - 1);
            if (currentLetters.entrySet().size() == wordLetters.entrySet().size())
                sum++;
        }
        return sum;
    }
}

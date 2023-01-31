import java.util.HashMap;
import java.util.Map;

public class LongestPolindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("ccc"));
    }

    public static int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c: s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.computeIfPresent(c, (k, v) -> v + 1);
            }
        }
        boolean hasSolo = false;
        int maxLength = 0;
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
          int currentValue = entry.getValue();
          if (currentValue % 2 == 0) {
              maxLength += currentValue;
          } else {
              hasSolo = true;
              maxLength += currentValue - 1;
          }
        }
        return hasSolo ? maxLength + 1: maxLength;
    }
}

import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfFrogsCroaking {
    public static void main(String[] args) {
        System.out.println(minNumberOfFrogs("croakcroak"));
        System.out.println(minNumberOfFrogs("crcoakroak"));
        System.out.println(minNumberOfFrogs("croakcrook"));
        System.out.println(minNumberOfFrogs("croakcroa"));
        System.out.println(minNumberOfFrogs("coark"));
    }

    public static int minNumberOfFrogs(String croakOfFrogs) {
        Map<Character, Integer> croaks = new HashMap<>();
        croaks.put('r', 0);
        croaks.put('o', 0);
        croaks.put('a', 0);
        croaks.put('k', 0);
        int maxSize = 0;
        for (Character c: croakOfFrogs.toCharArray()) {
            if (c == 'c') {
                croaks.replaceAll((k, v) -> v + 1);
                int currentSize = croaks.get('k');
                if (currentSize > maxSize) {
                    maxSize = currentSize;
                }
            } else {
                int current = croaks.get(c);
                int prev = croaks.get(getPrevChar(c));
                if (current == 0 || prev >= current && c != 'r') {
                    return -1;
                }
                croaks.put(c, current - 1);
            }
        }
        if (croaks.get('k') != 0) {
            return -1;
        }
        return maxSize;
    }

    public static char getPrevChar(char current) {
        switch (current) {
            case 'r', 'o' ->  {
                return 'r';
            }
            case 'a' -> {
                return 'o';
            }
            case 'k' -> {
                return 'a';
            }
        }
        throw new RuntimeException();
    }

}

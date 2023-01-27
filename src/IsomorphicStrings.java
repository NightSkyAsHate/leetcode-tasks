import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("badc", "baba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> characterMap = new HashMap<>();
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for (int i = 0; i < sChars.length; i++) {
            Character sc = sChars[i];
            Character tc = tChars[i];
            if (!characterMap.containsKey(sc) && !characterMap.containsValue(tc)) {
                characterMap.put(sc, tc);
            } else {
                Character c = characterMap.entrySet().stream()
                        .filter(x -> x.getValue().equals(tc))
                        .findFirst()
                        .map(Map.Entry::getKey)
                        .orElse(null);
                if (c == null || !c.equals(sc) || !characterMap.get(sc).equals(tc)) {
                    return false;
                }
            }
        }
        return true;
    }
}

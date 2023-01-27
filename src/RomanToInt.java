import java.util.HashMap;

public class RomanToInt {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer>  letters = new HashMap<>();
        letters.put('I', 1);
        letters.put('V', 5);
        letters.put('X', 10);
        letters.put('L', 50);
        letters.put('C', 100);
        letters.put('D', 500);
        letters.put('M', 1000);
        int v = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int current = letters.get(s.charAt(i));
            if (i != 0) {
                int next = letters.get(s.charAt(i - 1));
                if (current > next) {
                    v += current - next;
                    i--;
                } else {
                    v += current;
                }
            } else {
                v += current;
            }
        }
        return v;
    }
}

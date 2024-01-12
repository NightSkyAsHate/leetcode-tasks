import java.util.ArrayList;
import java.util.List;

public class GetLengthOfOptimalCompression {

    //todo: complete
    public static void main(String[] args) {
        getLengthOfOptimalCompression("aaabcccd", 2);
//        getLengthOfOptimalCompression("aabbaa", 2);
//        getLengthOfOptimalCompression("aaaaaaaaaaa", 0);
    }

    public static int getLengthOfOptimalCompression(String s, int k) {
        List<CharInner> charAmount = getCharAmount(s);
        printList(charAmount);
        return 0;
    }

    private static List<CharInner> getCharAmount(String s) {
        List<CharInner> chars = new ArrayList<>();
        int counter = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                chars.add(new CharInner(s.charAt(i), counter));
                counter = 1;
            } else {
                counter++;
            }
            if (i == s.length() - 2) {
                chars.add(new CharInner(s.charAt(i + 1), counter));
            }
        }
        return chars;
    }

    private static List<String[]> sortList(List<String[]> list) {
        return null;
    }

    private static void printList(List<CharInner> list) {
        for (CharInner s: list) {
            System.out.println(s.toString());
        }
    }

    public static class CharInner {
        private char c;
        private int amount;

        public CharInner(char c, int amount) {
            this.c = c;
            this.amount = amount;
        }

        public char getC() {
            return c;
        }

        public int getAmount() {
            return amount;
        }

        @Override
        public String toString() {
            return "CharInner{" +
                    "c=" + c +
                    ", amount=" + amount +
                    '}';
        }
    }
}

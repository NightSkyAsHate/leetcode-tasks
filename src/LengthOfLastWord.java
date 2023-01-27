import java.util.Arrays;

public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWordV1("Hello World")); // 5
        System.out.println(lengthOfLastWordV1("   fly me   to   the moon  ")); // 4
        System.out.println(lengthOfLastWordV1("luffy is still joyboy")); // 6
        System.out.println(lengthOfLastWordV1("a")); // 1
    }

    public static int lengthOfLastWord(String s) {
        return Arrays.stream(s.split(" "))
                .filter(x -> !x.isEmpty())
                .reduce((first, second) -> second)
                .orElse("")
                .length();
    }

    public static int lengthOfLastWordV1(String s) {
        char[] arr = s.toCharArray();
        int length = 0;
        boolean started = false;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != ' ') {
                length++;
                started = true;
            }
            if (arr[i] == ' ' && started) {
                return length;
            }
        }
        return length;
    }
}

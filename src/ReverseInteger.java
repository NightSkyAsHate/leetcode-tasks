public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        try {
            String reversed = new StringBuilder(String.valueOf(x)).reverse().toString();
            if (reversed.contains("-")) {
                reversed = reversed.substring(0, reversed.length() - 1);
                return Integer.parseInt(reversed) * -1;
            }
            return Integer.parseInt(reversed);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        String v = String.valueOf(x);
        int low = 0;
        int high = v.length() - 1;
        while (low < high) {
            if (v.charAt(low++) != v.charAt(high--))
                return false;
        }
        return true;
    }
}

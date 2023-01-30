public class IsSubsuquence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
        System.out.println(isSubsequence("", "ahbgdc"));
        System.out.println(isSubsequence("b", "abc"));
    }

    public static boolean isSubsequence(String s, String t) {
        char[] sa = s.toCharArray();
        if (sa.length == 0) {
            return true;
        }
        int sIndex = 0;
        for (char c: t.toCharArray()) {
            if (c == sa[sIndex]) {
                sIndex++;
            }
            if (sIndex >= sa.length) {
                return true;
            }
        }
        return false;
    }
}

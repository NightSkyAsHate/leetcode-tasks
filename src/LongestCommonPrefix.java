public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] arr = new String[]{"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(arr));
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        for (int i = 0; i < strs[0].length(); i++) {
            prefix += strs[0].substring(i, i + 1);
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(prefix)) {
                    return prefix.substring(0, i);
                }
            }
        }
        return prefix;
    }
}

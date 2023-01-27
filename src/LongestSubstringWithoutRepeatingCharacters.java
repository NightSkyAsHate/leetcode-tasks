public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("asljlj"));
    }

    public static int lengthOfLongestSubstring(String s) {
        StringBuilder currentSubstring = new StringBuilder();
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            String symbol = s.substring(i, i + 1);
            if (!currentSubstring.toString().contains(symbol)) {
                currentSubstring.append(symbol);
            } else {
                if (currentSubstring.length() > maxLength) {
                    maxLength = currentSubstring.length();
                }
                int index = currentSubstring.indexOf(symbol);
                if (index != currentSubstring.length())
                    index++;
                currentSubstring = new StringBuilder(currentSubstring.substring(index))
                        .append(symbol);
            }
        }
        if (!currentSubstring.toString().isEmpty() && currentSubstring.length() > maxLength)
            return currentSubstring.length();
        return maxLength;
    }
}

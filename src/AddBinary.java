public class AddBinary {

    public static String addBinary(String a, String b) {
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        boolean increase = false;
        StringBuilder result = new StringBuilder();
        while (aIndex != -1 || bIndex != -1) {
            boolean isA = aIndex != -1 && a.charAt(aIndex) == '1';
            boolean isB = bIndex != -1 && b.charAt(bIndex) == '1';
            if (!increase && !isA && !isB) {
                result.insert(0, "0");
                increase = false;
            } else if (!increase && isA && isB
                    || increase && !isA && isB
                    || increase && isA && !isB) {
                result.insert(0, "0");
                increase = true;
            } else if (!increase && !isA && isB
                || !increase && isA && !isB
                || increase && !isA && !isB) {
                result.insert(0, "1");
                increase = false;
            } else if (increase && isA && isB) {
                result.insert(0, "1");
            }
            if (aIndex > 0) {
                aIndex--;
            } else {
                aIndex = -1;
            }
            if (bIndex > 0) {
                bIndex--;
            } else {
                bIndex = -1;
            }
        }
        if (increase) {
            result.insert(0, "1");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        String a1 = "1010";
        String b1 = "1011";
        String a2 = "1111";
        System.out.println(addBinary(a, b)); // 100
        System.out.println(addBinary(a1, b1)); // 10101
        System.out.println(addBinary(a2, a2)); // 11110
    }
}

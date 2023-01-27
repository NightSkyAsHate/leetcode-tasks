import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        int[] array1 = new int[]{4, 3, 2, 1};
        int[] array2 = new int[]{9};
        System.out.println(Arrays.toString(plusOne(array))); // 1, 2, 4
        System.out.println(Arrays.toString(plusOne(array1))); // 4, 3, 2, 2
        System.out.println(Arrays.toString(plusOne(array2))); // 1, 0
    }

    public static int[] plusOne(int[] digits) {
        boolean increase = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                    increase = true;
                } else {
                    digits[i]++;
                    break;
                }
            } else {
                if (increase) {
                    if (digits[i] == 9) {
                        digits[i] = 0;
                        increase = true;
                    } else {
                        digits[i]++;
                        break;
                    }
                }
            }
        }
        if (increase) {
            int[] newArray = new int[digits.length + 1];
            newArray[0] = 1;
            System.arraycopy(digits, 0, newArray, 1, newArray.length - 1);
            return newArray;
        }
        return digits;
    }
}

import java.util.Arrays;

public class RunningSumOf1dArray {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4};
        Arrays.stream(runningSum(arr1)).forEach(System.out::print);
        System.out.println();
        int[] arr2 = new int[]{1, 1, 1, 1, 1};
        Arrays.stream(runningSum(arr2)).forEach(System.out::print);
        System.out.println();
        int[] arr3 = new int[]{3, 1, 2, 10, 1};
        Arrays.stream(runningSum(arr3)).forEach(System.out::print);
    }

    public static int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                res[i] = nums[i];
            } else {
                res[i] = nums[i] + res[i - 1];
            }
        }
        return res;
    }
}

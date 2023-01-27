public class FindPivotIndex {

    public static void main(String[] args) {
        System.out.println(pivotIndex1(new int[]{1, 7, 3, 6, 5, 6}));
        System.out.println(pivotIndex1(new int[]{1, 2, 3}));
        System.out.println(pivotIndex1(new int[]{2, 1, -1}));
        System.out.println(pivotIndex1(new int[]{-1, -1, -1, -1, -1, 0}));
    }

    public static int pivotIndex(int[] nums) {
        int lowIndex = 0;
        int highIndex = nums.length - 1;
        int lowSum = 0;
        int highSum = 0;
        while (lowIndex < highIndex) {
            int lowCurrent = nums[lowIndex] + lowSum;
            int highCurrent = nums[highIndex] + highSum;
            if (lowCurrent <= highCurrent) {
                lowIndex++;
                lowSum = lowCurrent;
            } else {
                highIndex--;
                highSum = highCurrent;
            }
        }
        if (lowSum != highSum) return -1;
        return lowIndex;
    }

    public static int pivotIndex1(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int upSum = 0;
            for (int j = i + 1; j < nums.length; j++) {
                upSum += nums[j];
            }
            if (upSum == sum) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}

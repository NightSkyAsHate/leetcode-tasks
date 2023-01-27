public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 6};
        int[] array1 = new int[]{1};
        int[] array2 = new int[]{1, 3};
        System.out.println(searchInsert(array, 5)); // 2
        System.out.println(searchInsert(array, 2)); // 1
        System.out.println(searchInsert(array, 7)); // 4
        System.out.println(searchInsert(array1, 2)); // 1
        System.out.println(searchInsert(array2, 1)); // 0
        System.out.println(searchInsert(array2, 3)); // 1
    }

    public static int searchInsert(int[] nums, int target) {
        int lowIndex = 0;
        int highIndex = nums.length - 1;
        while (true) {
            if (lowIndex == highIndex) {
                if (target <= nums[lowIndex]) {
                    return lowIndex;
                }
                return ++lowIndex;
            }
            if (highIndex - lowIndex == 1) {
                if (nums[lowIndex] >= target) {
                    return lowIndex;
                }
                if (nums[lowIndex] < target && nums[highIndex] >= target) {
                    return highIndex;
                }
                return ++highIndex;
            }
            int middleIndex = lowIndex + (highIndex - lowIndex) / 2;
            if (nums[middleIndex] == target) {
                return middleIndex;
            }
            if (nums[middleIndex] > target) {
                highIndex = middleIndex;
            } else {
                lowIndex = middleIndex;
            }
        }
    }

}

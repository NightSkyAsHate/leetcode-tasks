package algorithms;

public class QuickSort {

    public static int[] sort(int[] nums, int low, int high) {
        int pivotValue = nums[high];
        int i = low;
        int j = high - 1;
        if (i == j) {
            if (nums[i] > nums[j + 1]) {
                int v = nums[i];
                nums[i] = nums[j + 1];
                nums[j + 1] = v;
            }
        }
        while (i < j) {
            while (nums[i] < pivotValue) {
                i++;
            }
            int v = nums[i];
            nums[i] = nums[j];
            nums[j] = v;
            v = pivotValue;
            nums[j + 1] = nums[j];
            nums[j] = v;
            j--;
        }
        if (j == i)
            return nums;
        sort(nums, low, j);
        sort(nums, i + 1, high);
        return nums;
    }
}

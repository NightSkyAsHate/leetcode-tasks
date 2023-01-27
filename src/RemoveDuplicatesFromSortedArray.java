import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] k = new int[]{1, 1, 2};
        System.out.println(removeDuplicates(k));
        System.out.println(Arrays.toString(k));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        for (;j<nums.length;){
            for (;j<nums.length-1&&nums[j] == nums[j+1];){
                j++;
            }
            nums[i++] = nums[j++];
        }
        return i;
    }

}

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] indexes;
        int sum = 0;
        int v = (nums1.length + nums2.length) / 2;
        int maxIndex;
        if ((nums1.length + nums2.length) % 2 == 0) {
            indexes = new int[2];
            indexes[0] = v - 1;
            indexes[1] = v;
            maxIndex = v;
        } else {
            indexes = new int[1];
            indexes[0] = v;
            maxIndex = indexes[0];
        }
        int indexLeft = 0;
        int indexRight = 0;
        int indexSum = 0;
        while (indexSum != maxIndex) {
            indexSum = indexLeft + indexRight;
            if (check(indexes, indexSum)) {
                sum += Math.min(nums1[indexLeft], nums2[indexRight]);
            }

            if (nums1[indexLeft] < nums2[indexRight]) {
                indexLeft++;
            } else {
                indexRight++;
            }
        }
        return sum;
    }

    public static boolean check(int[] indexes, int index) {
        for (int i : indexes) {
            if (i == index)
                return true;
        }
        return false;
    }
}

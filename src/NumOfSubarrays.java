public class NumOfSubarrays {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 3, 5};
        System.out.println(numOfSubarrays(arr1));
        arr1 = new int[]{2, 4, 6};
        System.out.println(numOfSubarrays(arr1));
        arr1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(numOfSubarrays(arr1));
    }

    public static int numOfSubarrays(int[] arr) {
        long even = 0, odd = 0, sum = 0;
        for (int i: arr) {
            if (i % 2 == 0) {
                even++;
            } else {
                long temp = even;
                even = odd;
                odd = temp + 1;
            }
            sum += odd;
        }
        return (int) (sum % (Math.pow(10, 9) + 7));
    }
}

public class MinNumberOperations {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 2, 1};
        System.out.println(minNumberOperations(arr));
        arr = new int[]{3, 1, 1, 2};
        System.out.println(minNumberOperations(arr));
        arr = new int[]{3, 1, 5, 4, 2};
        System.out.println(minNumberOperations(arr));
    }

    public static int minNumberOperations(int[] target) {
        int sum = 0;
        int prev = 0;
        for (int i: target) {
            if (i > prev)
                sum += i - prev;
            prev = i;
        }
        return sum;
    }
}

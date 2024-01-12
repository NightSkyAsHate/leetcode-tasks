public class GetWinner {

    public static void main(String[] args) {
        System.out.println(getWinner(new int[]{2, 1, 3, 5, 3, 6, 7}, 2));
        System.out.println(getWinner(new int[]{3, 2, 1}, 10));
    }

    public static int getWinner(int[] arr, int k) {
        int currentMax = arr[0];
        int wins = 0;
        for (int i = 1; i < arr.length; i++) {
            if (wins == k) return currentMax;
            if (currentMax > arr[i]) wins++;
            if (currentMax < arr[i]) {
                wins = 1;
                currentMax = arr[i];
            }
        }
        return currentMax;
    }
}

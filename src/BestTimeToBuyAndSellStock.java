import java.util.Arrays;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4})); // 5
        System.out.println(maxProfit(new int[]{7,6,4,3,1})); // 0
        System.out.println(maxProfit(new int[]{1,4,2})); // 3
        System.out.println(maxProfit(new int[]{3,2,6,5,0,3})); // 4
        System.out.println(maxProfit(new int[]{2,7,1,4})); // 5
        System.out.println(maxProfit(new int[]{7,4,1,2})); // 1
        System.out.println(maxProfit(new int[]{2,1,2,1,0,1,2})); // 2
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int currentProfit = 0;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int currentPrice = prices[i];
            if (currentPrice < min) {
                min = currentPrice;
            }
            currentProfit = currentPrice - min;
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }
        return maxProfit;
    }
}

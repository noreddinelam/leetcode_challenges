package solution.day4;

public class BestTimeBuySellStock {
    public static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE, sell = 0;
        for (int price : prices) {
            buy = Math.min(buy, price);
            sell = Math.max(sell, price - buy);
        }
        return sell;
    }

    public static void main(String[] args) {
        int[] array = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(array));
    }
}

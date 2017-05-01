/**
 * Created by sunl on 4/18/17.
 */
public class BestTimeToBuyAndSellStockIII2 {

    public int maxProfit(int[] prices) {
        return calculate(prices, 0);
    }

    public int calculate(int prices[], int s) {
        if (s >= prices.length)
            return 0;
        int max = 0;
        for (int start = s; start < prices.length; start++) {
            int maxprofit = 0;
            for (int i = start + 1; i < prices.length; i++) {
                if (prices[start] < prices[i]) {
                    int profit = calculate(prices, i + 1) + prices[i] - prices[start];
                    if (profit > maxprofit)
                        maxprofit = profit;
                }
            }
            if (maxprofit > max)
                max = maxprofit;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] stock_prices = {-3, 0, 4, -1, 6, 0, 2, 7};
        BestTimeToBuyAndSellStockIII2 obj = new BestTimeToBuyAndSellStockIII2();
        System.out.println("The maximum profit we can make is: " + obj.maxProfit(stock_prices));
    }
}

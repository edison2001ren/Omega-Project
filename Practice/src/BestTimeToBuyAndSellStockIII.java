/**
 * Created by sunl on 4/18/17.
 */
public class BestTimeToBuyAndSellStockIII {

    public int maxProfit(int[] prices) {

        if(prices == null || prices.length == 0) {
            return 0;
        }
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            maxprofit += peak - valley;
        }
        return maxprofit;
    }

    public int maxProfit2(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] stock_prices = {-3, 0, 4, -1, 6, 0, 2, 7};
        BestTimeToBuyAndSellStockIII obj = new BestTimeToBuyAndSellStockIII();
        System.out.println("The maximum profit we can make is: " + obj.maxProfit(stock_prices));
        System.out.println("The maximum profit we can make is: " + obj.maxProfit2(stock_prices));
    }
}

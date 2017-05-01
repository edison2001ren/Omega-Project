/**
 * Created by sunl on 4/17/17.
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] stock_prices = {7, 1, 5, 3, 6, 4};
        //int[] stock_prices = {-3, 0, 4, -1, 6, 0, 2, 7};
        BestTimeToBuyAndSellStock obj = new BestTimeToBuyAndSellStock();
        System.out.println("The maximum profit we can make is: " + obj.maxProfit(stock_prices));
    }
}

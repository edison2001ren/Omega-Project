/**
 * Created by sunl on 4/17/17.
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        if(prices == null || prices.length == 0) {
            return 0;
        }
        int buy_point = 0;
        int sell_point = 0;
        boolean buy_flag = false;
        int profit = 0;

        for(int index = 1; index < prices.length; index++) {
            if(!buy_flag && index == 1 && (prices[1] > prices[0])) {
                buy_point = 0;
                buy_flag = true;
            }
            else if(!buy_flag && (prices[index] < prices[index - 1]) && (prices[index] < prices[index + 1])) {
                buy_point = index;
                buy_flag = true;
            }
            else if(buy_flag && (prices[index] > prices[index - 1]) && (prices[index] > prices[index + 1])) {
                sell_point = index;
                profit += prices[sell_point] - prices[buy_point];
                buy_flag = false;
            }
            else if(buy_flag && index == prices.length - 2 && prices[index] < prices[index + 1]) {
                sell_point = index + 1;
                profit += prices[sell_point] - prices[buy_point];
                buy_flag = false;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] stock_prices = {7, 1, 5, 3, 6, 4};
        //int[] stock_prices = {-3, 0, 4, -1, 6, 0, 2, 7};
        BestTimeToBuyAndSellStock obj = new BestTimeToBuyAndSellStock();
        System.out.println("The maximum profit we can make is: " + obj.maxProfit(stock_prices));
    }
}

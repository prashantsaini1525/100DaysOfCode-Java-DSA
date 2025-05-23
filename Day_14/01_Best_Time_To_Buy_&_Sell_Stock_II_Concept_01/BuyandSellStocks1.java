// time Complexity for this code is O(n)
// space Complexity for this code is O(1)
//Method 2
//Leetcode Question 121. Best Time to Buy and Sell Stock

public class BuyandSellStocks1 {
    public static int buyandSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            //buying price
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }
            //selling price
            int profit = prices[i] - buyPrice;
            //max profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyandSellStocks(prices));
    }
}

//time Complexity for this code is O(n)
//space Complexity for this code is O(1)
//Method 1
//Leetcode Question 121. Best Time to Buy and Sell Stock

public class BuyandSellStocks {
    public static int buyandSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {
            if(buyPrice < prices[i] ) { //profit
                int profit = prices[i] - buyPrice; //today's profit
                maxProfit = Math.max(maxProfit, profit); //max profit
            } else  {
                buyPrice = prices[i]; //buying price
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyandSellStocks(prices));
    }
}

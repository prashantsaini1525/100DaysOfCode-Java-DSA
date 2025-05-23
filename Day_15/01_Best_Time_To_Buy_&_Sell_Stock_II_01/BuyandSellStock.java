//time Complexity for this code is O(n)
//space Complexity for this code is O(1)
// Approach: Accumulate Every Positive Day-to-Day Gain (Greedy One-Pass)
//Leetcode Question 122. Best Time to Buy and Sell Stock II
//Method 1

public class BuyandSellStock {

    public static int maxProfit(int prices[]) {
        int totalProfit = 0;
        int n = prices.length;
        int profit;

        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                profit = prices[i] - prices[i - 1]; //today's profit
                totalProfit += profit; //total profit
            } else {
                profit = 0; //no profit
            }
        }
        return totalProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}

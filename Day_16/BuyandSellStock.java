//time Complexity for this code is O(n)
//space Complexity for this code is O(1)
// Approach: Accumulate Every Positive Day-to-Day Gain (Greedy One-Pass)
//Leetcode Question 122. Best Time to Buy and Sell Stock II
//Method 3

public class BuyandSellStock {

    // Function to find the maximum profit from stock prices
    public static int maxProfit(int prices[]) {
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}

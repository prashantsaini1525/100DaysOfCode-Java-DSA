//time Complexity for this code is O(n)
//space Complexity for this code is O(1)
// Approach: Accumulate Every Positive Day-to-Day Gain (Greedy One-Pass)
//Leetcode Question 122. Best Time to Buy and Sell Stock II
//Method 2

public class BuyandSellStock1 {

    public static int maxProfit(int prices[]) {
        int totalProfit = 0;
        int start = prices[0];
        int n = prices.length;

        for (int i = 1; i < n; i++) {
            if (start < prices[i]) {
                totalProfit += prices[i] - start;
            }
            start = prices[i]; // Update the start price to the current price
        }
        return totalProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}

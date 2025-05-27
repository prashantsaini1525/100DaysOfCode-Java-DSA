// Apna colllege Question 3
// DSA Sheet#8
// Leetcode #121 Best Time to Buy and Sell Stock
// Approach: One-Pass Greedy Scan (Buy Low, Sell High)
// Time Complexity: O(n)  ||  Space Complexity: O(1)

public class code {
    public static int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int n = prices.length;

        for(int i = 0; i < n; i++) {
            if(buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit =Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i]; 
            }
        }
        return maxProfit;   
    }
    public static void main(String[] args) {
        // int prices[] = {7, 1, 5, 3, 6, 4};
        int prices[] = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices)); // Output: 5
    }
}

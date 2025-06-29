public class BuyAndSellStock2 {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // Update minimum price so far
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate profit if selling today
            else {
                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(prices);
        System.out.println("Maximum Profit with 1 transaction: " + result); // Output: 5
    }
}
    


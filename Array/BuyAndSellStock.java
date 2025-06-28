public class BuyAndSellStock {
    public static int maxProfit(int price[]){
        int profit = 0;

        for(int i=1; i<price.length; i++){
            if(price[i] > price[i-1]){
                profit += price[i] - price[i-1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int price[] = {1, 5, 3, 8, 4};
        int result = maxProfit(price);
        System.out.println("Maximum Profit:" + result);
    }
}

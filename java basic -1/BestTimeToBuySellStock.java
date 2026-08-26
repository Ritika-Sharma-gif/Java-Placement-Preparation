public class BestTimeToBuySellStock {

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int minimumPrice = prices[0];
        int maximumProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < minimumPrice) {
                minimumPrice = prices[i];
            }

            int profit = prices[i] - minimumPrice;

            if (profit > maximumProfit) {
                maximumProfit = profit;
            }
        }

        System.out.println("Maximum Profit = " + maximumProfit);
    }
}
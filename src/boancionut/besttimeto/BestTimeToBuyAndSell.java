package boancionut.besttimeto;

public class BestTimeToBuyAndSell {

    public static int maxProfit(int[] prices)
    {
        if(prices.length < 1)
            return 0;
        int min = prices[0];
        int maxDifference = prices[1] - prices[0];
        for (int price : prices) {
            if (price - min > maxDifference)
                maxDifference = price - min;
            if (price < min) {
                min = price;
            }
        }
        return maxDifference;
    }
}

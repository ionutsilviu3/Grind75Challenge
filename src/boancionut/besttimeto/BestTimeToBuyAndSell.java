package boancionut.besttimeto;

public class BestTimeToBuyAndSell {

    public static int maxProfit(int[] prices)
    {                                               // to find the maximum profit we need to know two things, the minimum possible price and the biggest difference between the prices
        if(prices.length < 1)
            return 0;
        int min = prices[0];
        int maxDifference = prices[1] - prices[0];
        for (int price : prices) {
            if (price - min > maxDifference)        // at each iteration we check the max difference between the current price and the minimum price found yet
                maxDifference = price - min;
            if (price < min) {                      // we also check if the current price is less than the minimum currently found
                                                    // if it is, then this is the new minimum
                min = price;
            }
        }
        return maxDifference;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("The maximum possible profit is " + maxProfit(prices));
    }
}

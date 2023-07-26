/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 * Example:
 *
 * Input: prices = [7, 1, 5, 3, 6, 4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 */
public class BuyAndSellStock {
    public static int findProfit(int[] stocks){
        int stockMin = stocks[0];
        int stockMax = stocks[0];
        int profit = 0;
        for(int i = 0; i < stocks.length; i++){
            //Compare elements of array with min
            if(stocks[i] <= stockMin) stockMin = stocks[i];
            if(stocks[i] >= stockMax) stockMax = stocks[i];
        }
        System.out.println("Least stock val present in given array: " + stockMin);
        System.out.println("Greatest stock val present in given array: " + stockMax);

        profit = stockMax - stockMin;
        return profit;
    }
    public static void main(String[] args){
        int[] stocks = {7, 1, 1, 5, 3, 6, 4};
        System.out.println(findProfit(stocks));
    }

}

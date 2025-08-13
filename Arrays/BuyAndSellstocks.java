import java.util.*;


//Buy and sell stocks and make maximum possible profit 

public class BuyAndSellstocks {

    public static void profit(int prices[]) {
        int buy = Integer.MAX_VALUE ;
        int maxprofit = 0;
        for (int i = 0 ; i< prices.length ; i++) {
            buy = Math.min(buy, prices[i]);
            
            int profit = prices[i] - buy;

            maxprofit = Math.max(profit, maxprofit);
        }
        System.out.println("Total profit = " + maxprofit);
    }
    
    public static void main(String arg[]) {
        int prices[] = {7,1,5,3,6,4};
        profit(prices);
    }
    
}

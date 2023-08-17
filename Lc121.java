/*Question: 121. Best Time to Buy and Sell Stock.
Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 */
public class Lc121 {
    public int maxProfit(int[] prices) {
        int profit=Integer.MIN_VALUE;int j=0;
        if(prices.length==1){
            return 0;
        }
        for(int i=1;i<prices.length;i++){
            int net=prices[i]-prices[j];
            if(net<0){
                net=0;
                j=i;
            }
            if(net>profit){
                profit=net;
            }

        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        Lc121 t=new Lc121();
        System.out.println(t.maxProfit(arr));
    }
}

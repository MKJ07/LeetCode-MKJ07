import java.util.*;
/*Code Link:-https://leetcode.com/problems/maximum-ice-cream-bars/description/
Input: costs = [1,3,2,4,1], coins = 7
Output: 4
Explanation: The boy can buy ice cream bars at indices 0,1,2,4 for a total price of 1 + 3 + 2 + 1 = 7.

Input: costs = [1,6,3,1,2,5], coins = 20
Output: 6
Explanation: The boy can buy all the ice cream bars for a total price of 1 + 6 + 3 + 1 + 2 + 5 = 18.
 */
public class Lc1833 {
    public int maxIceCream(int[] costs, int coins) {
        // We can go for PriorityQueue as it internally sort the data added to it and its time complexity 
        // is O(log(n)) as compare to Arrays.sort() which takes O(nlog(n))
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        for(int i:costs){
            numbers.add(i);
        }
        // Arrays.sort(costs);
        int sum=0,c=0;
        for(int i=0;i<costs.length;i++){
            /*
            if(coins>=costs[i]){
                c++;
                coins-=costs[i];
            }
            */
            sum+=numbers.poll();
            if(sum<=coins){
                c++;
            }else if(sum>coins){
                break;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,4,1};int n=7;
        Lc1833 t=new Lc1833();
        System.out.println(t.maxIceCream(arr,n));
    }
}

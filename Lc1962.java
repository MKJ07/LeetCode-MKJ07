import java.util.*;
/*Code Link:-https://leetcode.com/problems/remove-stones-to-minimize-the-total/description/
Input: piles = [5,4,9], k = 2
Output: 12
Explanation: Steps of a possible scenario are:
- Apply the operation on pile 2. The resulting piles are [5,4,5].
- Apply the operation on pile 0. The resulting piles are [3,4,5].
The total number of stones in [3,4,5] is 12.
Input: piles = [4,3,6,7], k = 3
Output: 12
Explanation: Steps of a possible scenario are:
- Apply the operation on pile 2. The resulting piles are [4,3,3,7].
- Apply the operation on pile 3. The resulting piles are [4,3,3,4].
- Apply the operation on pile 0. The resulting piles are [2,3,3,4].
The total number of stones in [2,3,3,4] is 12.
 */
public class Lc1962 {
    public int minStoneSum(int[] piles, int k) {
        int n=piles.length;
        PriorityQueue<Integer> numbers = new PriorityQueue<>(Collections.reverseOrder());
	    for(int i=0;i<n;i++){
	        numbers.add(piles[i]);
	    }
	    for(int i=0;i<k;i++){
	        int s=0;
	        s=numbers.peek()-(int)Math.floor(numbers.peek()/2);
	        numbers.remove();
	        numbers.add(s);
	    }
	    int sum=0;
	    while(!numbers.isEmpty()){
	        sum+=numbers.peek();
	        numbers.remove();
	    }
        return sum;
    }
    public static void main(String[] args) {
	    int[] piles={4,3,6,7};int k=3;
        Lc1962 t=new Lc1962();
        System.out.println(t.minStoneSum(piles, k));
    }
}

import java.util.TreeMap;
/*Question: 846. Hand of Straights.
Link: https://leetcode.com/problems/hand-of-straights/description/

Example 1:
Input: 
    hand = [1,2,3,6,2,3,4,7,8], groupSize = 3
Output: 
    true
Explanation:
    Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8]

Example 2:
Input:
    hand = [1,2,3,4,5], groupSize = 4
Output: 
    false
Explanation: 
    Alice's hand can not be rearranged into groups of 4.
*/
public class Lc846 {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        /*This approach has TC: O(nlogk) and SC: O(k) { n: number of cards and k is the number of distinct cards.*/
        int n=hand.length;
        if(n%groupSize!=0)
            return false;
        TreeMap<Integer, Integer> h1 = new TreeMap<>();
        for(int i:hand){
            if(h1.containsKey(i))
                h1.put(i,h1.get(i)+1);
            else
                h1.put(i,1);
        }
        while(!h1.isEmpty()){
            int curr=h1.firstKey();
            for(int i=0;i<groupSize;i++){
                if(!h1.containsKey(curr+i))
                    return false;
                h1.put((curr+i),h1.get(curr+i)-1);
                if(h1.get(curr+i)==0)
                    h1.remove(curr+i);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Lc846 obj = new Lc846();
        int[] hand = {1, 2, 3, 6, 2, 3, 4, 7, 8};
        int groupSize = 3;
        
        boolean result = obj.isNStraightHand(hand, groupSize);
        System.out.println(result); // Expected output: true

        hand = new int[]{1, 2, 3, 4, 5};
        groupSize = 4;
        result = obj.isNStraightHand(hand, groupSize);
        System.out.println(result); // Expected output: false
    }
}

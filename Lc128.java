import java.util.HashSet;
import java.util.Set;

/*Question: 128. Longest Consecutive Sequence.
Link: https://leetcode.com/problems/longest-consecutive-sequence/description/

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
*/
public class Lc128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int len=0;
        for(int i:nums){
            set.add(i);
        }
        for(int i:set){
            if(!set.contains(i-1)){
                int count=1;
                int element=i;
                while(set.contains(element+1)){
                    count++;
                    element+=1;
                }
                len=Math.max(len, count);
            }
        }
        return len;
    }

    public static void main(String[] args) {
        Lc128 t=new Lc128();
        int[] arr={187, 64, 133, 62, 49, 163, 50, 115, 42, 65, 60, 49, 32, 87, 141, 142, 146, 159};
        System.out.println(t.longestConsecutive(arr));
    }
}

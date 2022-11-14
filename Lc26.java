import java.util.*;
import java.util.Set;
/*Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]*/
public class Lc26 {
    public static void main(String[] args) {
        int[] nums ={-3,-1,0,0,0,3,3};
        Set<Integer> s1 = new HashSet<> ();
        for(int i=0;i<nums.length;i++){
            s1.add(nums[i]);
        }  
        List<Integer> li = new ArrayList<>(s1);
        Collections.sort(li);
        int j=0;
        for(int i:li){
            nums[j]=i;
            j++;
        }
        for(int i=0;i<li.size();i++){
                System.out.print(nums[i]);
        }
    }
    
}

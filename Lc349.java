import java.util.*;
/*Question: 349. Intersection of Two Arrays
Link: https://leetcode.com/problems/intersection-of-two-arrays/description/

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
*/

public class Lc349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i=0,j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> hashSet = new HashSet<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                hashSet.add(nums1[i]);
                i++;
                j++;
            }
        }
        int []res=new int[hashSet.size()];
        int idx=0;
        for(int e:hashSet){
            res[idx]=e;
            idx++;
        }
        return res;
        
    }
    public static void main(String[] args) {
        Lc349 t=new Lc349();
        int []a={2,4,5,4,8,3,1};
        int []b={2,5,9,6,8};
        int []res=t.intersection(a, b);
        for (int i : res) {
            System.out.print(i+" ");
        }
    }
}

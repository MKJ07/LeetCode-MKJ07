import java.util.*;
/*Code Link:-https://leetcode.com/problems/maximum-bags-with-full-capacity-of-rocks/description/
Input: capacity = [2,3,4,5], rocks = [1,2,4,4], additionalRocks = 2
Output: 3
Explanation:
Place 1 rock in bag 0 and 1 rock in bag 1.
The number of rocks in each bag are now [2,3,4,4].
Bags 0, 1, and 2 have full capacity.
There are 3 bags at full capacity, so we return 3.
It can be shown that it is not possible to have more than 3 bags at full capacity.
Note that there may be other ways of placing the rocks that result in an answer of 3.

Input: capacity = [10,2,2], rocks = [2,2,0], additionalRocks = 100
Output: 3
 */
public class Lc2279 {
    public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n=0;
        int[] arr=new int[capacity.length];
        for(int i=0;i<capacity.length;i++){
            arr[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                n++;
            }
            else if(additionalRocks>=arr[i]){
                additionalRocks-=arr[i];
                n++;
            }
        }
        return n;
        /*Another approach but all the test cases will not satisfied */
        // for(int i=0;i<capacity.length;i++){
        //     System.out.print(additionalRocks+" ");
        //     if(rocks[i]==capacity[i])
        //         n++;
        //     else if(rocks[i]<capacity[i]){
        //         int l=capacity[i]-rocks[i];
        //         if(additionalRocks==l){
        //             rocks[i]+=l;
        //             additionalRocks=0;
        //             if(rocks[i]==capacity[i])
        //                 System.out.println("hello");
        //                 n++;
        //         }
        //         else if(l<additionalRocks){
        //             rocks[i]+=(additionalRocks-l);
        //             additionalRocks-=l;
        //             if(rocks[i]==capacity[i])
        //                 System.out.println("hello");
        //                 n++;
        //         }
        //     }
        // }
        // return n;
        
    }
    public static void main (String[]args){
        int a[]={10,2,2};
        int b[]={2,2,0};
        int rocks=100;
        System.out.println (maximumBags(a,b,rocks));
    }
    
}

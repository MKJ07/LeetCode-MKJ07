import java.util.Arrays;
import java.util.HashMap;
/*Question: 1122. Relative Sort Array.
Link: https://leetcode.com/problems/relative-sort-array/description/

Example 1:
Input: 
    arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
Output: 
    [2,2,2,1,4,3,3,9,6,7,19]

Example 2:
Input:
    arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
Output:
    [22,28,8,6,17,44]
*/
public class Lc1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        /*This approach has TC: O(n1 log n1) and SC: O(n1) { n1: length of arr1 } */
        Arrays.sort(arr1);
        int n1=arr1.length,n2=arr2.length;
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i:arr1){
            if(h1.containsKey(i))
                h1.put(i,h1.get(i)+1);
            else{
                h1.put(i,1);
            }
        }
        int res[]=new int[n1];
        int idx1=0,idx2=0;
        while(!h1.isEmpty() && idx2<n2){
            int temp=arr2[idx2];
            if(h1.containsKey(temp)){
                while(h1.get(temp)>0){
                    res[idx1]=temp;
                    h1.put(temp,h1.get(temp)-1);
                    idx1++;
                } 
                h1.remove(temp);               
            }            
            idx2++;
        }
        int t=0;
        while(!h1.isEmpty() && t<n1){
            int temp=arr1[t];
            if(h1.containsKey(temp)){
                while(h1.get(temp)>0){
                    res[idx1]=temp;
                    h1.put(temp,h1.get(temp)-1);
                    idx1++;
                }
                h1.remove(temp);
            }
            t++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7};
        int[] arr2 = {2, 3, 1, 4, 6};
        Lc1122 obj=new Lc1122();
        int[] result = obj.relativeSortArray(arr1, arr2);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

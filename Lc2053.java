import java.util.HashMap;
/*Question: 2053. Kth Distinct String in an Array.
Link: https://leetcode.com/problems/kth-distinct-string-in-an-array/description/

Example 1:

    Input: 
        arr = ["d","b","c","b","c","a"], k = 2
    Output: 
        "a"
    Explanation:
        The only distinct strings in arr are "d" and "a".
        "d" appears 1st, so it is the 1st distinct string.
        "a" appears 2nd, so it is the 2nd distinct string.
        Since k == 2, "a" is returned.
         
Example 2:

    Input: 
        arr = ["aaa","aa","a"], k = 1
    Output: 
        "aaa"
    Explanation:
        All strings in arr are distinct, so the 1st string "aaa" is returned.

Example 3:

    Input: 
        arr = ["a","b","a"], k = 3
    Output: 
        ""
    Explanation:
        The only distinct string is "b". Since there are fewer than 3 distinct strings, we return an empty string "".
    
*/

public class Lc2053 {
    public String kthDistinct(String[] arr, int k) {
        /*This approach has TC: O(n) and SC: O(n) {n: length of the array } */
        HashMap<String,Integer> h1=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            String c=arr[i];
            if(h1.containsKey(c)){
                h1.put(c,h1.get(c)+1);
            }
            else{
                h1.put(c,1);
            }
        }
        String res="";
       for(int i=0;i<n;i++){
            String c=arr[i];
            if(h1.containsKey(c) && h1.get(c)==1){
                if(k==1){
                    res=c; 
                    break;
                }
                else{
                    k--;
                }
            }
       }
        return res;
    }
    public static void main(String[] args) {
        Lc2053 finder = new Lc2053();

        String[] arr1 = {"a", "b", "a", "c", "d", "c", "e", "f"};
        int k1 = 3;
        String result1 = finder.kthDistinct(arr1, k1);
        System.out.println("The " + k1 + "-th distinct string is: " + result1);

        String[] arr2 = {"a", "b", "a", "b", "c", "d"};
        int k2 = 1;
        String result2 = finder.kthDistinct(arr2, k2);
        System.out.println("The " + k2 + "-th distinct string is: " + result2);

        String[] arr3 = {"apple", "banana", "apple", "orange", "banana", "grape"};
        int k3 = 2;
        String result3 = finder.kthDistinct(arr3, k3);
        System.out.println("The " + k3 + "-th distinct string is: " + result3);

        String[] arr4 = {"x", "y", "z", "x", "y", "z"};
        int k4 = 1;
        String result4 = finder.kthDistinct(arr4, k4);
        System.out.println("The " + k4 + "-th distinct string is: " + result4);
    }
}

/*Question: 1299. Replace Elements with Greatest Element on Right Side.
Link: https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
Explanation: 
- index 0 --> the greatest element to the right of index 0 is index 1 (18).
- index 1 --> the greatest element to the right of index 1 is index 4 (6).
- index 2 --> the greatest element to the right of index 2 is index 4 (6).
- index 3 --> the greatest element to the right of index 3 is index 4 (6).
- index 4 --> the greatest element to the right of index 4 is index 5 (1).
- index 5 --> there are no elements to the right of index 5, so we put -1.
*/
public class Lc1299 {
    static int maxele(int[] arr,int start,int n){
        int m=Integer.MIN_VALUE;
        for(int i=start;i<n;i++){
            if(arr[i]>m){
                m=arr[i];
            }
        }
        return m;
    }
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        if(n==1){
            arr[0]=-1;
            return arr;
        }
        for(int i=0;i<n-1;i++){
            int max=maxele(arr,i+1,n);
            arr[i]=max;
        }
        arr[n-1]=-1;
        return arr;
    }
    public static void main(String[] args) {
       Lc1299 obj=new Lc1299();
       int[] arr={17,18,5,4,6,1};
       System.out.println(obj.replaceElements(arr)); 
    }
}

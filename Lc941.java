/*Question: 941. Valid Mountain Array.
Link: https://leetcode.com/problems/valid-mountain-array/

Input: arr = [2,1]
Output: false

Input: arr = [3,5,5]
Output: false
*/
public class Lc941 {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        if(n<3){
            return false;
        }
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                count++;
            }
        }
        if(count==n-1 || count==0){
            return false;
        }
        for(int i=count;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int []nums={0,3,2,1};
        Lc941 obj=new Lc941();
        System.out.println(obj.validMountainArray(nums));
    }
}

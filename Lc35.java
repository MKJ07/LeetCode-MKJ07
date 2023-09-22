/*Input: nums = [1,3,5,6], target = 2
Output: 1
Input: nums = [1,3,5,6], target = 7
Output: 4 
*/
public class Lc35 {
    public int searchInsert(int[] nums, int target) {
        /*This is using binary search using while loop and more clearly */
        int n=nums.length;
        int l=0,r=n-1;
        int idx=0;
        if(n==0|| nums[0]>=target){
            return 0;
        }
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]<target){
                idx=mid;
                l=mid+1;
            }
            else if(nums[mid]==target){
                return mid;
            }
            else{
                r=mid-1;
            }
        }
        return idx+1;

        /*This is also using binary search but using for loop
        int min=0;
        int max=nums.length;
        int mid=0,f=0;
        for(int i=0;i<nums.length;i++){
            mid=(min+max)/2;
            if(nums[mid]==target){
                f=1;
                return mid;
            }
            else if(nums[mid]<target){
                min=min+1;
            }
            else{
                max=max-1;
            }
        }
        if(f==0){
            if(nums[mid]<target){
                return mid+1;
            }
        }
        return mid; */

        //Another way is given below
        // int c=0;
        // if(nums[0]>target){
        //     return 0;
        // }
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         return i;
        //     }
        //     else if(nums[i]<target){
        //         c=i;
        //     }
        // }
        // return c+1;
        
    }
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int t=5;
        Lc35 l=new Lc35();
        System.out.println(l.searchInsert(nums, t));
    }
    
}

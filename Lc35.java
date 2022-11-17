/*Input: nums = [1,3,5,6], target = 2
Output: 1
Input: nums = [1,3,5,6], target = 7
Output: 4 */
public class Lc35 {
    public int searchInsert(int[] nums, int target) {
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
        return mid;
        
    }
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int t=5;
        Lc35 l=new Lc35();
        System.out.println(l.searchInsert(nums, t));
    }
    
}

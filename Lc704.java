/*Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1 */
public class Lc704 {
    public int search(int[] nums, int target) {
        int l=nums.length;
        int min=0, max=l;
        int mid=(max+min)/2;
        for(int i=0;i<l;i++){
            if(nums[mid]==target){
                return mid;                
            }
            else if(target>nums[mid]){
                min++;
            }
            else{
                max--;
            }
            mid=(min+max)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        int target=9;
        Lc704 l=new Lc704();
        System.out.println(l.search(nums, target));
    }
    
}

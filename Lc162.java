public class Lc162 {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int low=1,high=n-2;
        if(n==1 || nums[0]>nums[1]){
            return 0;
        }
        if(nums[n-1]>nums[n-2]){
            return n-1;
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(nums[mid]>nums[mid-1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 20, 4, 1, 0};
        Lc162 t=new Lc162();
        int peakIndex = t.findPeakElement(nums);

        if (peakIndex != -1) {
            System.out.println("Peak element is at index " + peakIndex);
        } else {
            System.out.println("No peak element found.");
        }
    }
}

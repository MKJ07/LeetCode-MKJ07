public class Lc31 {
    static void rev(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int brkPoint=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                brkPoint=i;
                break;
            }
        }
        if(brkPoint==-1){
            rev(nums,0,n-1);
        }
        else{
            for(int i=n-1;i>=0;i--){
                if(nums[brkPoint]<nums[i]){
                    int temp=nums[brkPoint];
                    nums[brkPoint]=nums[i];
                    nums[i]=temp;
                    break;
                }
            }
            rev(nums,brkPoint+1,n-1);
        }

    }
    public static void main(String[] args) {
        int[] nums={1,4,5,3,2};
        Lc31 t=new Lc31();
        t.nextPermutation(nums);
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
}

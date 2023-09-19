public class Lc287 {
    public int findDuplicate(int[] nums) {
        int []arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Lc287 t=new Lc287();
        int[] arr={1,2,3,4,4,4,5,6};
        System.out.println(t.findDuplicate(arr));
    }
}

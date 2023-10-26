import java.util.List;

public class Lc448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        /*This is the brute force approach having TC: O(n^2) and SC: O(1) 
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            int p=0;
            for(int j=0;j<nums.length;j++){
                if(i==nums[j]){
                    p=1;
                }
            }
            if(p==0){
                l.add(i);
            }
        }
        return l; */
    }
    public static void main(String[] args) {
        int[] nums={1, 2, 2, 3, 3, 3};
        Lc448 obj=new Lc448();
        System.out.println(obj.findDisappearedNumbers(nums));
    }
}

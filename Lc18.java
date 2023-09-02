import java.util.*;
public class Lc18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int one=0;one<n;one++){
            if(one>0 && nums[one]==nums[one-1]){
                continue;
            }
            for(int two=one+1;two<n;two++){
                if(two>(one+1) && nums[two]==nums[two-1]){
                    continue;
                }
                int three=two+1;
                int four=n-1;
                while(three<four){
                    long sum=nums[one];
                    sum+=nums[two];
                    sum+=nums[three];
                    sum+=nums[four];
                    if(sum==target){
                        List<Integer> l=new ArrayList<>();
                        l.add(nums[one]);
                        l.add(nums[two]);
                        l.add(nums[three]);
                        l.add(nums[four]);
                        list.add(l);
                        three++;
                        four--;
                        while(three<four && nums[three]==nums[three-1]){
                            three++;
                        }
                        while(three<four && nums[four]==nums[four+1]){
                            four--;
                        }

                    }
                    else if(sum<target){
                        three++;

                    }
                    else{
                        four--;
                    }
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums={2,2,2,2,2};
        Lc18 t=new Lc18();
        System.out.println(t.fourSum(nums, 8));
    }
}

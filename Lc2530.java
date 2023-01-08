/*Question:- 2530. Maximal Score After Applying K Operations.
 *link:- https://leetcode.com/contest/weekly-contest-327/problems/maximal-score-after-applying-k-operations/

Input: nums = [1,10,3,3,3], k = 3
Output: 17
Explanation: You can do the following operations:
Operation 1: Select i = 1, so nums becomes [1,4,3,3,3]. Your score increases by 10.
Operation 2: Select i = 1, so nums becomes [1,2,3,3,3]. Your score increases by 4.
Operation 3: Select i = 2, so nums becomes [1,1,1,3,3]. Your score increases by 3.
The final score is 10 + 4 + 3 = 17.

Input: nums = [10,10,10,10,10], k = 5
Output: 50
Explanation: Apply the operation to each array element exactly once. The final score is 10 + 10 + 10 + 10 + 10 = 50.
*/
public class Lc2530 {
    public static int maxValue(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    public long maxKelements(int[] nums, int k) {
        int score=0;
        while(k!=0){
            int m=maxValue(nums);
            for(int i=0;i<nums.length;i++){
                int flag=0;
                if(nums[i]==m){
                    int t=0;
                    // if we do direct nums[i]/3 it will give value in double
                    // while using Math.ceil(nums[i]/3) it will give floor value only
                    // direct: 10/3=3.33 but in Math.ceil(10/3) will give 3.0
                    t=(int)Math.ceil((nums[i]/3)+1);
                    nums[i]=t;
                    score+=m;
                    flag=1;
                }
                if(flag==1)
                    break;
            }
            k--;
        }
        return score;
    }
	public static void main(String[] args) {
	    Lc2530 t=new Lc2530();
	    int[] arr={1,10,3,3,3};int k=3;
		System.out.println(t.maxKelements(arr,k));
	}
}

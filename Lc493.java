import java.util.*;
/*Question: 493. Reverse Pairs.
Link: https://leetcode.com/problems/reverse-pairs/description/

Input: nums = [2,4,3,5,1]
Output: 3
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 4, nums[4] = 1, 4 > 2 * 1
(2, 4) --> nums[2] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 5, nums[4] = 1, 5 > 2 * 1
*/
public class Lc493 {
    /*This is the merge sort part and performing the calculation */
    static void merge(int[] arr,int l,int mid,int r){
        ArrayList<Integer> al=new ArrayList<>();
        int low=l;
        int high=mid+1;
        while(low<=mid && high<=r){
            if(arr[low]>arr[high]){
                al.add(arr[high]);
                high++;
            }
            else{
                al.add(arr[low]);
                low++;
            }
        }
        while(low<=mid){
            al.add(arr[low]);
            low++;
        }
        while(high<=r){
            al.add(arr[high]);
            high++;
        }
        for(int i=l;i<=r;i++){
            arr[i]=al.get(i-l);
        }

    }
    static int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int cnt = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && (long)(arr[i])> 2 *(long)(arr[right])) right++;
            cnt += (right - (mid + 1));
        }
        return cnt;
    }
    static int mergeSort(int [] arr,int l,int r){
        int cnt=0;
        if(l>=r){
            return cnt;
        }
        int mid=(l+r)/2;
        cnt+=mergeSort(arr,l,mid);
        cnt+=mergeSort(arr,mid+1,r);
        cnt+= countPairs(arr, l, mid, r);
        merge(arr,l,mid,r);
        return cnt;


    }
    public int reversePairs(int[] nums) {
        /*This is the optimal approach using mergeSort and counting the pairs
         having TC:O(n*logn) and SC:O(n) */
        int n=nums.length;
        return mergeSort(nums,0,n-1);
        /*This is the brute force approach having TC:O(n^2) and SC:O(1) 
        int cnt=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                long n1=(nums[i]);
                long n2=(nums[j]);
                if(n1>2*n2){
                    cnt++;
                }
            }
        }
        return cnt; */
    }
    public static void main(String args[]){
        int[] arr={1,3,2,3,1};
        Lc493 t=new Lc493();
        System.out.println(t.reversePairs(arr));
    }
}

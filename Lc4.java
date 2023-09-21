/*Question: 4. Median of Two Sorted Arrays.
Link: https://leetcode.com/problems/median-of-two-sorted-arrays/description/

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
*/
public class Lc4 {
    static int[] merge(int[] nums1,int[]nums2){
        int i=0,j=0;
        int n=nums1.length,m=nums2.length;
        int[] res=new int[n+m];
        int idx=0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                res[idx]=nums1[i];
                idx++;
                i++;
            }
            else{
                res[idx]=nums2[j];
                idx++;
                j++;
            }
        }
        while(i<n){
            res[idx]=nums1[i];
            i++;idx++;
        }
        while(j<m){
            res[idx]=nums2[j];
            j++;idx++;
        }
        return res;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergeArray=merge(nums1,nums2);
        int n=mergeArray.length;
        if(n%2==0){
            int n1=mergeArray[n/2-1];
            int n2=mergeArray[n/2];
            return (double)(n1+n2)/2;
        }
        else{
            return mergeArray[n/2];
        }
    }
    public static void main(String[] args) {
        int []arr1={1,2,4,5,8};
        int []arr2={3,4,5,7};
        Lc4 t=new Lc4();
        System.out.println(t.findMedianSortedArrays(arr1, arr2));
    }
}

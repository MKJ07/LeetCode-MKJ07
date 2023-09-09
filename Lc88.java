import java.util.Arrays;
/*Question: 88. Merge Sorted Array
Link: https://leetcode.com/problems/merge-sorted-array/description/

int[] nums1 = new int[]{4, 5, 6, 0, 0, 0};
int m = 3;
int[] nums2 = new int[]{1, 2, 3};
int n = 3;
*/
public class Lc88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=n-1;
        int j=0;
        while(i>=0 && j<n){
            /*This works when array has negative elements */
            if (Math.abs(nums1[i]) > Math.abs(nums2[j])) {
            int temp = nums1[i];
            nums1[i] = nums2[j];
            nums1[m + j] =(temp);
            i--;j++;
            }
            /*This works only when there is no negative element in the array */
            // if(nums1[i]>nums2[j]){
            //     int temp=nums1[i];
            //     nums1[i]=nums2[j];   
            //     nums1[m+j]=temp;
            //     i--;j++;
            // }
            else{
                nums1[m+j]=nums2[j];
                i--;
                j++;
            }
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        Lc88 t=new Lc88();
        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
        int m = 3, n = 3;
        t.merge(nums1, m, nums2, n);
       for(int i=0;i<nums1.length;i++){
        System.out.print(nums1[i]+" ");
       }
    }
}

public class Lc2540 {
    public int getCommon(int[] nums1, int[] nums2){
        /*This is a better approach having TC: O(n+m) and SC: O(n) {n: length of first array, m: length of second array}
        HashMap<Integer,Integer> h1=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i:nums1){
            if(h1.containsKey(i))
                h1.put(i,h1.get(i)+1);
            else
                h1.put(i,1);
        } 
        for(int i:nums2){
            if(h1.containsKey(i)){
                min=Math.min(min,i);
            }
        }
        return min==2147483647 ? -1:min; */

        /*This is the brute force approach having TC: O(n^2) and SC: O(1) 
        int min=Integer.MAX_VALUE;
        int n1=nums1.length,n2=nums2.length;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    min=Math.min(min,nums1[i]);
                }
            }
        }
        return min; */
    }
    public static void main(String[] args) {
        Lc2540 obj=new Lc2540();
        int[] nums1={1,4,6,8,9,12,15},nums2={8,9,12,16};
        System.out.println(obj.getCommon(nums1, nums2));
    }
}

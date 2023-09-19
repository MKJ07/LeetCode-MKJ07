public class Lc152 {
    public int maxProduct(int[] nums) {
        long pre = 1, suff = 1;
        long maxproduct = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (pre == 0) {
                pre = 1;
            }
            if (suff == 0) {
                suff = 1;
            }
            pre = (pre * nums[i]) % 1000000007;
            suff = (suff * nums[nums.length - i - 1]) % 1000000007;
            maxproduct = Math.max(maxproduct, Math.max(pre, suff)) % 1000000007;

        }
        return (int) maxproduct;
    }
    public static void main(String[] args) {
        Lc152 t=new Lc152();
        int[] arr={1,2,4,6,-1,4,5,7,8,2};
        System.out.println(t.maxProduct(arr));
    }
}

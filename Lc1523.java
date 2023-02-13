/*Question: 1523. Count Odd Numbers in an Interval Range.
Link:-https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/description/

Input: low = 3, high = 7
Output: 3
Explanation: The odd numbers between 3 and 7 are [3,5,7].

Input: low = 8, high = 10
Output: 1
Explanation: The odd numbers between 8 and 10 are [9].
 */
public class Lc1523 {
    public int countOdds(int low, int high) {
        // Below code will give TLE for some cases.
        // int c=0;
        // for(int i=low;i<=high;i++){
        //     if(i%2!=0){
        //         c++;
        //     }
        // }
        // while(low<=high){
        //     if(low%2!=0){
        //         c++;
        //     }
        //     low++;
        // }
        // return c;
        if((low%2==0) && (high%2==0)){
            return (high-low)/2;
        }
        else{
            return ((high-low)/2)+1;
        }
        
    }
    public static void main(String[] args) {
        int l=3;int h=7;
        Lc1523 t=new Lc1523();
        System.out.println(t.countOdds(l, h));
    }
}

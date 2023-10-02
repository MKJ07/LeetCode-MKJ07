/*Question: 2038. Remove Colored Pieces if Both Neighbors are the Same Color.
Link: https://leetcode.com/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color/

Input: colors = "ABBBBBBBAAA"
Output: false
Explanation:
ABBBBBBBAAA -> ABBBBBBBAA
Alice moves first.
Her only option is to remove the second to last 'A' from the right.

ABBBBBBBAA -> ABBBBBBAA
Next is Bob's turn.
He has many options for which 'B' piece to remove. He can pick any.

On Alice's second turn, she has no more pieces that she can remove.
Thus, Bob wins, so return false.
*/
public class Lc2038 {
    public boolean winnerOfGame(String colors) {
        int bob=0,alice=0;
        int n=colors.length();
        int i=0;
        while(i<n){
            int a1=0,b1=0;
            while(i<n && colors.charAt(i)=='A'){
                a1++;i++;
            }
            while(i<n && colors.charAt(i)=='B'){
                b1++;i++;
            }
            if(a1>2){
                alice+=a1-2;
            }
            if(b1>2){
                bob+=b1-2;
            }
        }
        if(alice>bob){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Lc2038 t=new Lc2038();
        String s="ABBBBBBBAAA";
        System.out.println(t.winnerOfGame(s));
    }
}

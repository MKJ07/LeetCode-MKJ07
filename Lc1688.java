/*Question: 1688. Count of Matches in Tournament
Link: https://leetcode.com/problems/count-of-matches-in-tournament/description/

Input: n = 14
Output: 13
Explanation: Details of the tournament:
- 1st Round: Teams = 14, Matches = 7, and 7 teams advance.
- 2nd Round: Teams = 7, Matches = 3, and 4 teams advance.
- 3rd Round: Teams = 4, Matches = 2, and 2 teams advance.
- 4th Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
Total number of matches = 7 + 3 + 2 + 1 = 13.
*/
public class Lc1688 {
    public int numberOfMatches(int n) {
        /*On observation we came across that every input it will have ouput as n-1
         this is the optimal approach having TC: O(1) and SC: O(1)*/

         return n-1;
        /*This is the brute force approach having TC: O(logn) and SC: O(1) 
        int sum=0;
        while(n>1){
            if(n%2==0){
                int mat=n/2;
                n/=2;
                sum+=mat;
            }
            else{
                int mat=(n-1)/2;
                n=(n-1)/2+1;
                sum+=mat;
            }
        }
        return sum;
        */
    }

    public static void main(String[] args) {
        Lc1688 obj=new Lc1688();
        System.out.println(obj.numberOfMatches(49));
    }
}

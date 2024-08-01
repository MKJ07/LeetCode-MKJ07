/*Question: 2678. Number of Senior Citizens.
Link: https://leetcode.com/problems/number-of-senior-citizens/description/

Example 1:
Input: 
    details = ["7868190130M7522","5303914400F9211","9273338290F4010"]
Output: 
    2
Explanation: 
    The passengers at indices 0, 1, and 2 have ages 75, 92, and 40. 
    Thus, there are 2 people who are over 60 years old.

Example 2:
Input: 
    details = ["1313579440F2036","2921522980M5644"]
Output: 
    0
Explanation: 
    None of the passengers are older than 60.
*/

public class Lc2678 {
    public int countSeniors(String[] details) {
        /*This approach has TC: O(n) and SC: O(1) {n: no of elements } */
        int cnt=0;
        int n=details.length;
        for(int i=0;i<n;i++){
            int age = Integer.parseInt(details[i].substring(11, 13));
            if(age>60)
                cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        String[] details = {
            "1234567890M62A1",
            "0987654321F55B2",
            "1122334455M61C3",
            "9988776655F72D4"
        };

        Lc2678 obj = new Lc2678();
        int seniorCount = obj.countSeniors(details);
        System.out.println("Number of seniors: " + seniorCount);
    }
}

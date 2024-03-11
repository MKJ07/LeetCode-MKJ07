import java.util.HashMap;
/*Question: 791. Custom Sort String.
Link: https://leetcode.com/problems/custom-sort-string/description/

Example 1:
Input:  order = "cba", s = "abcd" 
Output:  "cbad" 
Explanation: "a", "b", "c" appear in order, so the order of "a", "b", "c" should be "c", "b", and "a".
Since "d" does not appear in order, it can be at any position in the returned string. "dcba", "cdba", "cbda" are also valid outputs.

Example 2:
Input:  order = "bcafg", s = "abcd" 
Output:  "bcad" 
Explanation: The characters "b", "c", and "a" from order dictate the order for the characters in s. The character "d" in s does not appear in order, so its position is flexible.
Following the order of appearance in order, "b", "c", and "a" from s should be arranged as "b", "c", "a". "d" can be placed at any position since it's not in order. The output "bcad" correctly follows this rule. Other arrangements like "bacd" or "bcda" would also be valid, as long as "b", "c", "a" maintain their order.
*/
public class Lc791 {
    public String customSortString(String order, String s) {
        /*
         * This approach has TC: O(n + m + k) and SC: O(n) {n: length of the second
         * string, m: length of the first string, k: no of elements left in map after m
         * iterations}
         */
        HashMap<Character, Integer> h1 = new HashMap<>();
        for (char c : s.toCharArray()) {
            h1.put(c, h1.getOrDefault(c, 0) + 1);
        }
        StringBuilder res = new StringBuilder();
        for (char c : order.toCharArray()) {
            if (h1.containsKey(c)) {
                int f = h1.get(c);
                while (f > 0) {
                    res.append(c);
                    f--;
                }
                h1.remove(c);
            }
        }
        for (char ch : h1.keySet()) {
            int f = h1.get(ch);
            while (f > 0) {
                res.append(ch);
                f--;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String order = "bacefghik", s = "dakgesmi";
        Lc791 obj = new Lc791();
        System.out.println(obj.customSortString(order, s));
    }
}

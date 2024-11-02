/*Question: 2490. Circular Sentence.
Link: https://leetcode.com/problems/circular-sentence/description/

Example 1:

Input: sentence = "leetcode exercises sound delightful"
Output: true
Explanation: 
    The words in sentence are ["leetcode", "exercises", "sound", "delightful"].
    - leetcode's last character is equal to exercises's first character.
    - exercises's last character is equal to sound's first character.
    - sound's last character is equal to delightful's first character.
    - delightful's last character is equal to leetcode's first character.
    The sentence is circular.

Example 2:
Input: sentence = "eetcode"
Output: true
Explanation: 
    The words in sentence are ["eetcode"].
    - eetcode's last character is equal to eetcode's first character.
    The sentence is circular.

Example 3:
Input: sentence = "Leetcode is cool"
Output: false
Explanation: 
    The words in sentence are ["Leetcode", "is", "cool"].
    - Leetcode's last character is not equal to is's first character.
    The sentence is not circular.
*/

public class Lc2490 {
    public boolean isCircularSentence(String sentence) {
        /*This approach has TC: O(n) and SC: O(n) {n: no of elements} */
        int n = sentence.length();
        if (sentence.charAt(0) != sentence.charAt(n - 1)) {
            return false;
        }
        
        String[] arr = sentence.split(" ");
        int arrL = arr.length;
        
        for (int i = 0; i < arrL - 1; i++) {
            int n1 = arr[i].length();
            if (arr[i].charAt(n1 - 1) != arr[i + 1].charAt(0)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Lc2490 obj = new Lc2490();
        
        String sentence1 = "hello olleh";
        String sentence2 = "this sentence is not circular";
        String sentence3 = "ab ba";

        System.out.println("Is sentence1 circular? " + obj.isCircularSentence(sentence1)); // true
        System.out.println("Is sentence2 circular? " + obj.isCircularSentence(sentence2)); // false
        System.out.println("Is sentence3 circular? " + obj.isCircularSentence(sentence3)); // true
    }
}

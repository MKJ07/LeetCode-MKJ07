import java.util.Stack;
/*Question: 1700. Number of Students Unable to Eat Lunch.
Link: https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/description/

Example 1:
Input: students = [1,1,0,0], sandwiches = [0,1,0,1]
Output: 0 
Explanation:
- Front student leaves the top sandwich and returns to the end of the line making students = [1,0,0,1].
- Front student leaves the top sandwich and returns to the end of the line making students = [0,0,1,1].
- Front student takes the top sandwich and leaves the line making students = [0,1,1] and sandwiches = [1,0,1].
- Front student leaves the top sandwich and returns to the end of the line making students = [1,1,0].
- Front student takes the top sandwich and leaves the line making students = [1,0] and sandwiches = [0,1].
- Front student leaves the top sandwich and returns to the end of the line making students = [0,1].
- Front student takes the top sandwich and leaves the line making students = [1] and sandwiches = [1].
- Front student takes the top sandwich and leaves the line making students = [] and sandwiches = [].
Hence all students are able to eat.

Example 2:
Input: students = [1,1,1,0,0,1], sandwiches = [1,0,0,0,1,1]
Output: 3
*/

public class Lc1700 {
    public int countStudents(int[] students, int[] sandwiches) {
        /*This approach has TC: O(N) {N is the maximum of the lengths of the sandwiches and students arrays.}
         and SC: O(1) {Since arr length is constant} */
        int arr[]=new int[2];
        for(int i:students){
            arr[i]++;
        }
        Stack<Integer> st=new Stack<>();
        for(int i=sandwiches.length-1;i>=0;i--){
            st.push(sandwiches[i]);
        }
        while(!st.isEmpty()){
            if(arr[st.peek()]>0){
                arr[st.peek()]=arr[st.peek()]-1;
                st.pop();
            }
            else{
                break;
            }
        }
        
        return arr[0]+arr[1];

        /*This approach has TC: O(N) {N is the maximum of the lengths of the sandwiches and students arrays.} and
          SC: O(N) {N is the maximum of the lengths of the sandwiches and students arrays.}

        Stack<Integer> st=new Stack<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=sandwiches.length-1;i>=0;i--){
            st.push(sandwiches[i]);
        }
        for(int i:students){
            q.add(i);
        }
        while(!q.isEmpty() && !st.isEmpty()){
            int s=q.poll();
            if(st.peek()==s){
                st.pop();
            }
            else{
                q.add(s);
            }
        }
        return q.size(); */
    }
    public static void main(String[] args) {
        int[] students={1,0,1,1,1,0,1,1};
        int[] sandwiches={1,0,1,0,1,0,1,1};
        Lc1700 obj=new Lc1700();
        System.out.println(obj.countStudents(students, sandwiches));
    }
}

import java.util.*;
/*Code Link:-https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/description/
Input: tasks = [2,2,3,3,2,4,4,4,4,4]
Output: 4
Explanation: To complete all the tasks, a possible plan is:
- In the first round, you complete 3 tasks of difficulty level 2. 
- In the second round, you complete 2 tasks of difficulty level 3. 
- In the third round, you complete 3 tasks of difficulty level 4. 
- In the fourth round, you complete 2 tasks of difficulty level 4.  
It can be shown that all the tasks cannot be completed in fewer than 4 rounds, so the answer is 4.

Input: tasks = [2,3,3]
Output: -1
Explanation: There is only 1 task of difficulty level 2, but in each round, you can only complete either 2 or 3 tasks of the same difficulty level. Hence, you cannot complete all the tasks, and the answer is -1.
*/
public class Lc224 {
    public static int minimumRounds(int[] tasks){
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<tasks.length;i++){
            if (map.containsKey(tasks[i]))
                map.put(tasks[i], map.get(tasks[i]) + 1);
            else
                map.put(tasks[i],1);
        }  
        int count=0;
        for(Map.Entry<Integer,Integer> m:map.entrySet()){  
            int f=m.getValue();
            if(f==1)
                return -1;
            while(f>3){
                f-=3;
                count++;
            }
            if(f>=1)
                count++;
        } 
        
        return count;
    }
	public static void main(String[] args) {
	   // int[] a={2,2,3,3,2,4,4,4,4,4};
	    int[] a={2,3,3};
	    System.out.println(minimumRounds(a));
		  
	}
}

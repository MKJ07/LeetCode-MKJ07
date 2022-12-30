import java.util.*;
/*Code Link:-https://leetcode.com/problems/all-paths-from-source-to-target/description/
Input: graph = [[1,2],[3],[3],[]]
Output: [[0,1,3],[0,2,3]]
Explanation: There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.
Input: graph = [[4,3,1],[3,2,4],[3],[4],[]]
Output: [[0,4],[0,3,4],[0,1,3,4],[0,1,2,3,4],[0,1,4]]
 */
public class Lc797 {
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> a = new ArrayList<>();
        List<Integer> p = new ArrayList<>();
        p.add(0);
        dfs(graph, a, p, 0);
        return a;
        
    }
    public static void dfs(int[][] graph, List<List<Integer>> a, List<Integer> p, int n){
        if(n == graph.length-1){ 
            a.add(new ArrayList<>(p));
            return; 
        }
        for(int val : graph[n]){
            p.add(val);
            dfs(graph, a, p, val);
            p.remove(p.size()-1);
        }
    }
    public static void main(String[] args) {
        int[][] gr={{1,2},{3},{3},{}};
        System.out.println(allPathsSourceTarget(gr));


    }
}

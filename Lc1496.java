import java.util.ArrayList;
/*Question: 1496. Path Crossing.
Link: https://leetcode.com/problems/path-crossing/description/

Input: path = "NESWW"
Output: true
Explanation: Notice that the path visits the origin twice.
*/
public class Lc1496 {
    public boolean isPathCrossing(String path) {
        /*This approach has TC: O(n) and SC: O(n)*/
        ArrayList<String> al=new ArrayList<>();
        int x=0,y=0;
        al.add(x+","+y);
        char arr[]=path.toCharArray();
        for(char i:arr){
            if(i=='N')
                y++;
            else if(i=='E')
                x++;
            else if(i=='S')
                y--;
            else
                x--;
            String cord=x+","+y;
            if(al.contains(cord))
                return true;
            else{
                al.add(cord);
            }

        }
        return false;
    }

    public static void main(String[] args) {
        String path="NSEWNSWESWESNSWESNEWSNNSWEEWSEWN";
        Lc1496 obj=new Lc1496();
        System.out.println(obj.isPathCrossing(path));
    }
}

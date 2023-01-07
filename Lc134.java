/*Question:- 134.Gas Station
 *Link:-https://leetcode.com/problems/gas-station/description/

Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
Output: 3
Explanation:
Start at station 3 (index 3) and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
Travel to station 4. Your tank = 4 - 1 + 5 = 8
Travel to station 0. Your tank = 8 - 2 + 1 = 7
Travel to station 1. Your tank = 7 - 3 + 2 = 6
Travel to station 2. Your tank = 6 - 4 + 3 = 5
Travel to station 3. The cost is 5. Your gas is just enough to travel back to station 3.Therefore, return 3 as the starting index.

Input: gas = [2,3,4], cost = [3,4,3]
Output: -1
*/
public class Lc134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index=0,tank=0,tank1=0,cost1=0;
        for(int i=0;i<gas.length;i++){
           tank1+=gas[i];
        }
        for(int i=0;i<gas.length;i++){
           cost1+=cost[i];
        }
        if(tank1<cost1){
            return -1;
        }
        for(int i=0;i<gas.length;i++){
            tank+=(gas[i]-cost[i]);
            if(tank<0){
                tank=0;
                index=i+1;
            }         
            
        }
        return index;

    }
    public static void main(String[] args) {
        int[] gas={1,2,3,4,5};
        int[] cost={3,4,5,1,2};
        Lc134 t=new Lc134();
        System.out.println(t.canCompleteCircuit(gas, cost));

    }
}

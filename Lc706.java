/*Question: 706. Design HashMap.
Link: https://leetcode.com/problems/design-hashmap/description/

Input
["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
[[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
Output
[null, null, null, 1, -1, null, 1, null, -1]

Explanation
MyHashMap myHashMap = new MyHashMap();
myHashMap.put(1, 1); // The map is now [[1,1]]
myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
*/
import java.util.*;
public class Lc706 {
    static final int SIZE = 1000007;
    int[] values;
    
    public void MyHashMap() {
        values = new int[SIZE];
        Arrays.fill(values, -1);
    }
    
    public void put(int key, int value) {
        values[key] = value;
    }
    
    public int get(int key) {
        return values[key];
    }
    
    public void remove(int key) {
        values[key] = -1;
    }

    public static void main(String[] args) {
        Lc706 hashMap = new Lc706();

        // Insert key-value pairs
        hashMap.put(1, 100);
        hashMap.put(2, 200);
        hashMap.put(3, 300);

        // Retrieve values
        int value1 = hashMap.get(1); // Should return 100
        int value2 = hashMap.get(2); // Should return 200
        int value3 = hashMap.get(3); // Should return 300
        int value4 = hashMap.get(4); // Should return -1 (key not found)

        System.out.println("Value for key 1: " + value1);
        System.out.println("Value for key 2: " + value2);
        System.out.println("Value for key 3: " + value3);
        System.out.println("Value for key 4: " + value4);

        // Remove a key-value pair
        hashMap.remove(2);

        int removedValue = hashMap.get(2); // Should return -1 (key was removed)

        System.out.println("Value for key 2 after removal: " + removedValue);
    }
}

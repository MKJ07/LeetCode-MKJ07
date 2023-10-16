import java.util.*;

public class Lc119 {
    static List<Integer> NCR(int n){
        List<Integer> al = new ArrayList<>();
        al.add(1);
        long ans = 1;
        for (int i = 1; i < n; i++) {
            ans = (ans * (n - i)) / i;
            al.add((int) ans);
        }
        return al;
    }
    public List<Integer> getRow(int rowIndex) {
      List<Integer> li=NCR(rowIndex+1);
      return li;
      
    }
    public static void main(String[] args) {
        Lc119 t=new Lc119();
        int rowIndex = 30;
        List<Integer> result = t.getRow(rowIndex);
        System.out.println(result);
    }
}

/*Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Input: digits = [1,2,3]
Output: [1,2,4]*/
public class Lc66 {
    public static void main(String[] args) {
        int[] digits={1,2,3};
        for(int i=digits.length-1;i>=0;i--){
        if(digits[i]!=9){
            digits[i]+=1;
            break;
        }
        else{
            digits[i]=0;
        }
    }
    if(digits[0]==0){
        int[] n=new int[digits.length+1];
        n[0]=1;
        for(int i=0;i<n.length;i++){
            System.out.println(n[i]+" ");
        }
    }
    for(int i:digits){
        System.out.print(i+" ");
    } 
    }
    
}

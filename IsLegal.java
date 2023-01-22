
package islegal;

public class IsLegal {
    public static void main(String[] args){
        int[][] tests = {{3, 2, 1}, {3, 7, 1}};
        int[] bases = {4, 6};
        
        for (int i = 0; i < bases.length; i++){
            System.out.println(isLegalNumber(tests[i], bases[i]));
        }
    }
    
    static int isLegalNumber(int[] a, int base){
        int ans = 1;
        
        for (int i = 0; i < a.length; i++){
            if (a[i] >= base){
                return 0;
            }
        }
        
        return ans;
    }
}
   

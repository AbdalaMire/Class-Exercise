
package issquare;


public class IsSquare {
    public static void main(String[] args){ 
        int[] tests = {4, 25, -4, 8, 0};
        for (int test : tests){ 
            System.out.println(isSquare(test));
        }
    }
public static int isSquare(int num) {
    if (num < 0) return 0;
    int i = 1;
    while (i*i <= num) {
        if (i*i == num) return 1;
        i++;
    }
    return 0;
}
    
    
}

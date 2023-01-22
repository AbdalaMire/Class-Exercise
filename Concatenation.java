public class Concatenation {
    public static void main(String[] args) {
        test(198, 2, 1);
        test(198, 3, 0);
        test(2997, 3, 1);
        test(2997, 2, 0);
        test(13332, 4, 1);
        test(9, 1, 1);

    }

    static int checkConcatenatedSum(int n, int catlen) {
        int original = n; 
        int sum = 0;
        while (n > 0) { 
            int digit = n % 10;
            int concatenated = 0;
            for (int i = 0; i < catlen; i++) {
                concatenated = concatenated * 10 + digit;
            }
            sum += concatenated;
            n /= 10;
        }
        if (original == sum) {
            return 1;
        }
        else {
            return 0;
        } 
    }

    static void test(int n, int catlen, int e) {
        if (checkConcatenatedSum(n, catlen) == e) {
            System.out.println("PASSED");
        } else {
            System.err.println(">>> FAILED");
        }
    }
}
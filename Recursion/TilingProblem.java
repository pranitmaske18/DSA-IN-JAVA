package Recursion;

public class TilingProblem {

    public static int tile(int n){
        if(n==0 || n==1){
            return 1;

        }


        // 2 *n floor
        // vertical choice
        int fnm1 = tile(n-1);

        // horizontal choice 
        int fnm2 = tile(n-2);
        int totways = fnm1 + fnm2;
        return totways;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(tile(n));
    }
}

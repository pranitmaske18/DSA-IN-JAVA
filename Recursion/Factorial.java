package Recursion;

public class Factorial {

    public static int fac(int n){
        if(n==0){
            return 1;
        }
        int fnm1= fac(n-1);//no need if use this
        int fc = n * fnm1; //or int fc = n * fac(n-1)
        return fc;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fac(n));
    }
}

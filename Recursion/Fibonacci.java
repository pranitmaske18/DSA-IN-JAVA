package Recursion;

public class Fibonacci {
//O(2'n)
    public static int fib(int n){
        if(n==0 || n==1){
            return n ;
        }

        int fnm1=fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1+fnm2;
        return fn;
    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println(fib(n));
    }
}

//O(1)
// class Solution {
//     public int fib(int n) {
//         if (n <= 1) {
//             return n;
//         }

//         int a = 0;
//         int b = 1;

//         for (int i = 2; i <= n; i++) {
//             int c = a + b;
//             a = b;
//             b = c;
//         }

//         return b;
//     }
// }
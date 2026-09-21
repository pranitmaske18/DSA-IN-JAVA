package Recursion;

public class PowerOfX {

    public static int Power(int x, int n){
        if(n==0){
            return 1;
        }
        // int xnm1= Power(x,n-1);
        // int xn = x * xnm1;
        // return xn;
        return x * Power(x,n-1);
    }
    public static void main(String[] args) {

        System.out.println(Power(5, 2));

    }
}
//   lc50
//   class Solution {

//     public double myPow(double x, int n) {

//         long N = n;

//         if (N < 0) {
//             x = 1 / x;
//             N = -N;
//         }

//         return power(x, N);
//     }

//     public double power(double x, long n) {

//         if (n == 0) {
//             return 1;
//         }

//         double half = power(x, n / 2);

//         if (n % 2 == 0) {
//             return half * half;
//         }

//         return x * half * half;
//     }
// }
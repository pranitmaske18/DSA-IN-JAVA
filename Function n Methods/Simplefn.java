import java.util.*;
/**
 * Simplefn
 */
public class Simplefn {
    public static void sum(int a,int b){
        
        int sum = a + b;
        System.out.println("Sum Of Two Numbers Inputed is : " +sum);
    }


    public static int factorial(int n){
        int f = 1;
        for(int i=1; i<=n;i++){
            f=f*i;
        }
        return f;
    }   
    
    
    public static int bicoff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int bc = fact_n / (fact_r * fact_nmr);
        return bc;
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("enter first number");
        int a =sc.nextInt();
        //System.out.println("Enter second number");
        int b = sc.nextInt();
        //sum(a,b);
        //System.out.println("Enter number which wants to find factorial");
        //int n = sc.nextInt();
        //int x = factorial(n);
        //System.out.println(x);
        System.out.println(bicoff(a,b));
        sc.close();
}
        
}

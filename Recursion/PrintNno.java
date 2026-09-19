package Recursion;

public class PrintNno {
    public static void PrintDec(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        PrintDec(n-1);
       // System.out.print(n + " ");   for Increasing Order
    }
    public static void main(String[] args) {
        int n = 110;
        PrintDec(n);
    }
}

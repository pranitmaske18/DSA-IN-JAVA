package loops;
import java.util.*;
/*
Printing first N numbers using while loop
*/
public class PrintNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N to print first N natural numbers:");
        int N = sc.nextInt();
        int n = 1;
        while (n<=N){
            System.out.println(n);
            n++;
       }
         sc.close();
        }
    }


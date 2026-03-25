import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int product = a * b;
        
        System.out.println("the sum of to numbers is : "+sum);
        System.out.println("the product of two numbers is : "+product);
        sc.close();
    }
}




/*
Always close a scanner using sc.close();

*/
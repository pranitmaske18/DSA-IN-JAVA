import java.util.*;
/*
Program to check if a person is eligible to vote based on age.

*/
public class Voting {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("You are eligible to vote.");
        }
        else {
            System.out.println("You are not eligible to vote.");
        }
        sc.close();
    }
}

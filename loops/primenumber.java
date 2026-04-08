package loops;
import java.util.*;
public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime or not:");
        int num = sc.nextInt();
        sc.close();
        if(num==2){
            System.out.println(num+"Is a prime number");
        } else {
            boolean isPrime=true;
            for (int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime=false;
                    
                }
            }
            if(isPrime==true){
                System.out.println(num+" is a prime number");
            } else {
                System.out.println(num+" is not a prime number");
            }
            
        
    }
    
}
}
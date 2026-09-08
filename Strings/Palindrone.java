package Strings;
import java.util.*;
public class Palindrone {

    public static boolean isPalindrone(String str){
        int n = str.length();
        for(int i =0; i< str.length()/2;i++){
            if(str.charAt(i)!= str.charAt(n-1-i)){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string to check");
        String str =sc.nextLine();
        System.out.println(isPalindrone(str));
        sc.close();
    }
}

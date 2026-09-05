package Strings;
import java.util.*;
public class Inoutput {
    public static void main(String[] args) {
        //String str = "abcd";
       // String str2 = new String("XYZ");
        // STRingS ARE IMMUTABLE

        Scanner sc = new Scanner(System.in);
        String namef;
        //name= sc.next(); // for single word
        namef= sc.nextLine();
        System.out.println(namef);
        int alenghth = namef.length();
        System.out.println(alenghth);
        sc.close();

    }
}

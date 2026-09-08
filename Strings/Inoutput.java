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
        namef= sc.nextLine();//For complete Line
        System.out.println(namef);
        int alenghth = namef.length();  //in array length is poriterty so we dont use()and
        System.out.println(alenghth);   //  in string its a fuction so we use ()
        sc.close();

        // String concatenation
        String Firstname="Pranit";
        String Lastname="Maske";
        String Fullname = Firstname + " " + Lastname;
        System.out.println(Fullname);
        // To print Charter of string
        //Str.charAt();


    }
 }

// to compare strings
// == if It checks whether both variables point to the same String object in memory.
//Even though the content is the same, a and b are different objects.


// strname.equals(strname2)  It checks whether the actual String values are the same.

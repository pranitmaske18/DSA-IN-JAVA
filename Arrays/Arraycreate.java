package Arrays;
import java.util.*;
public class Arraycreate {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int marks[]= new int[5];
        System.out.println("marks of phy");
        marks[0]=sc.nextInt();
        System.out.println("marks of chy");
        marks[1] = sc.nextInt();
        System.out.println("marks of math");
        marks[2] = sc.nextInt();
        System.out.println(marks.length);
        sc.close();
    }
}

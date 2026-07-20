package Arrays;

//import java.util.Scanner;

public class LinearSearch {

   // TIME COMPLECITY O(N)
    public static int LinearS(int numbers[],int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]== key){
                return i;
            }
            
        }
        return -1;
    }
    
    public static int largestn(int numbers[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }


    public static void main(String[] args) {
        int numbers[]={1,20,120,22,23,585,365,2441,};
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Key");
        // int key=sc.nextInt();
        // int index = LinearS(numbers,key);
        // if(index==-1){
        //     System.out.println("NOT FOUND");
        // } else {
        //     System.out.println("Number is found at index  "+index);
        // }
        System.out.println(largestn(numbers));
        //sc.close();
    }
}

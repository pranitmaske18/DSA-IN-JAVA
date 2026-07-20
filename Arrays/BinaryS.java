package Arrays;
//import java.util.*;
public class BinaryS {
    
    public static int Bs(int num[], int key){
        int start=0, end=num.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }



                                        //time cmplecity O(log n)



    public static void main(String[] args){
        int num[]={12,25,26,29,35,65,78,86,96};
        int key = 86;
        System.out.println("Key found at index: "+Bs(num, key));
    }
}

package Recursion;

public class LastOcc {
    public static int LastOccu(int arr[],int i,int key){
        if(i == arr.length){
            return -1;
        }
        int isFound=LastOccu(arr, i+1, key);
        if(isFound== -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }


    public static void main(String[] args) {
        int arr[]={2,3,5,6,5,5,5,9};
        System.out.println(LastOccu(arr, 0, 5));
    }
}   


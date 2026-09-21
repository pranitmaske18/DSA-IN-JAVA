package Recursion;

public class Firstoccurence {
    public static int FirstOcc(int arr[],int i,int key){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FirstOcc(arr, i+1, key);
    }


    public static void main(String[] args) {
        int arr[]={2,5,6,5,3,5,6,9};
        System.out.println(FirstOcc(arr, 0, 5));
    }
}
package Arrays;
//import java.util.*;

public class SortingAlorithms {




                            // BUBBLE SORT O(N)
    public static void bubbles(int arr[]){
        for(int turn=0; turn<arr.length-1;turn++){
            for(int j= 0; j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //SWAPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                        
                
                }
            }
        }
    }


    public static void printarr(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


                                        //Selection Sort

    public static void selections(int arr[]){
        for(int i=0; i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length; j++){
                if(arr[minPos]> arr[j]){ 
                // FOR DECENDING ORDER <
                    minPos=j;
                }
            }
            //SWAPP
                    int temp= arr[minPos];
                    arr[minPos]=arr[i];
                    arr[i]= temp;
        }
    }

                    // INSERTION SORT

    public static void insertionSort(int arr[]){
        for(int i =1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i -1;
            // Finding out the correction pos to insert 
            while(prev >=0 && arr[prev] > curr){  // < use to chnage order
                arr[prev +1 ] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev + 1] =curr;
        }
    }



                                            //Counting Sort

    public static void countings(int arr[]){
        int largest= Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest +1];
        for(int i = 0; i<arr.length; i++){
            count[arr[i]]++;
        }
        //Sorting
        int j = 0;
        for(int i = 0; i<count.length; i++){
            while(count[i]> 0){
                arr[j]=i;
                j++;
                count[i]--;
            }

        }



    }




    public static void main(String args[]){
        int arr[]={5,4,1,3,2,7,5,2,3,2};
        // bubbles(arr); printarr(arr);
        // selections(arr);printarr(arr);
        //insertionSort(arr);printarr(arr);
        // Arrays.sort(arr);printarr(arr);
        countings(arr);printarr(arr);
    }
}

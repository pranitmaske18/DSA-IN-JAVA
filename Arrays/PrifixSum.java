package Arrays;
// To find sum of max sub array using prifixmenthod
// prific[i-1]+arr[i]
// time complecity On2

public class PrifixSum {
    public static void Maxsum(int num[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]= new int[num.length];



        prefix[0]=num[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i]=prefix[i-1]+num[i];
        }


        for(int i=0; i<num.length; i++){
            int start = i;
            for(int j=1; j<num.length;j++){
                int end=j;
                currsum = start== 0 ? prefix[end] : prefix[end]-prefix[start-1];
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("Max sum =  "+maxsum);
    }


    public static void main(String[] args){
        int num[]={-6,6,3,2,-1,};
        Maxsum(num);
    }
}

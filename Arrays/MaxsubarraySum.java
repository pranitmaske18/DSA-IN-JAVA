package Arrays;

public class MaxsubarraySum {
        public static void SubAsum(int number[]){

            int currsum=0;
            int maxsum= Integer.MIN_VALUE;
        for(int i =0; i<number.length;i++){
            int start=i;
            for(int j = i; j<number.length;j++){
                int end = j;
                currsum=0;
                for(int k=start; k<=end;k++){
                    currsum+= number[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                   maxsum=currsum; 
                }
                
            }
            
        }
        System.out.println( "maxsum is "+ maxsum);
    }

//TIME COMPLEXCITY LOgn3


    public static void main(String[] args){
        int number[]={12,2,3,5,36,69};
        SubAsum(number);
    }
}


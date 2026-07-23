package Arrays;
//TIME COMPLEXITY O(n)
public class KadanesAlgo {
    public static void kadanes(int num[]){
        int ms =  Integer.MIN_VALUE;
        int cs =0;
        for(int i=0;i<num.length;i++){
            cs = cs+num[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);

        }
        System.out.println("max sumis : "+ms);

    }
    public static void main(String[] args) {
        int num[]={6,36,-6,32,-2,-6,7,8};
        kadanes(num);
    }
}

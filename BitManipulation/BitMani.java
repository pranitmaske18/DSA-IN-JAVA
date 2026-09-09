package BitManipulation;

public class BitMani {
    public static int getithbit(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }
        else{return 1;}
    }



     public static int setithbit(int n,int i){
        int bitmask=1<<i;
        return n | bitmask;


        }
    
    public static void main(String[] args) {
        getithbit(10, 2);
        setithbit(10, 20);
    }
}

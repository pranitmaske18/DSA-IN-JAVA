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
    

    public static int clearIBitsinRange(int n , int i,int j){
        int a =((~0)<<(j+1));
        int b =(1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean PowerofTWo(int n){
            return (n&(n-1))==0;
    }

    public static int NumOFSetBIts(int n){
        int count = 0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n = n>>1;
        }
        return count ;
    }

    public static int FastExp(int a,int n){
        int ans = 1;
        while (n>0) {
            if((n&1)!=0){
                ans = ans * a;
            }
            a = a *a ;
            n = n>>1;
            
        }
        return ans ;
    }
    public static void main(String[] args) {
        // getithbit(10, 2);
        // setithbit(10, 20);
        // System.out.println(clearIBitsinRange(10,2,4));
        // System.out.println(PowerofTWo(16));
        // System.out.println(NumOFSetBIts(16));
        System.out.println(FastExp(5, 3));
    }

}

package Recursion;

public class PairFriends {

    public static int friendsp(int n){

        if(n==1 || n==2){
            return n;
        }
        int fnm1 =friendsp(n-1);

        //pair
        int fnm2 = friendsp(n-2);
        int pairways= (n-1) * fnm2;
        int totways = fnm1 + pairways;
        return totways;


        //return friendsp(n-1) + (n-1) * friendsp(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendsp(5));
    }
}

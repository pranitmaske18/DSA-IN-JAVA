package Arrays;

public class BuyNSell {
    public static int BNS(int price[]){
        int buyp= Integer.MAX_VALUE;
        int maxprofit=0;
        
        for(int i=0; i<price.length;i++){
            if(buyp< price[i]){
                int profit = price[i] - buyp;
                maxprofit = Math.max(maxprofit,profit);
            }
            else {
                buyp= price[i];

            }
        }
        return maxprofit;
    }

// time complecity O(n)
    public static void main(String args[]){
        int price[] ={7,1,5,3,6,4};
        System.out.println(BNS(price));
    }
    
}

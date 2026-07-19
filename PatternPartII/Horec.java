package PatternPartII;

public class Horec {
    public static void hrec(int totrows,int totcols){
        for(int i=1; i<=totrows;i++){
            for(int j=1; j<=totcols;j++){
                if(i==1 || i==totrows || j==1 || j==totcols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }




    
    public static void floyds(int n){
        int counter=1;
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i;j++ ){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }





    public static void zero_one_rec(int n){
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 ==0){
                    System.out.print("1"+" ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }






    public static void butterfly(int n){
        //first half
        for(int i=1; i<=n; i++){
            //stars - i
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            // spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //stars-i
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // second half
        for(int i=n; i>=1;i--){
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            // spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //stars-i
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }



public static void main(String args[]){
        //hrec(4,5);
        //floyds(50);
        //zero_one_rec(5);
        butterfly(5);
    }  
}


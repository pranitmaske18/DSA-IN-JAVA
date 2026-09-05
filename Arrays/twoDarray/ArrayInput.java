package Arrays.twoDarray;
import java.util.*;
public class ArrayInput {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int n = arr.length , m = arr[0].length; // LENGTH OF ROWS AND COLOUMNS
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n; i++){
            for(int j =0; j<m;j++){
                arr[i][j]=sc.nextInt();
                
            }
        }// PRINTING OF NUMERS OF ARRYS
        for(int i = 0; i<n; i++){
            for(int j =0; j<m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

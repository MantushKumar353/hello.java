import java.util.Scanner;

public class pattrn {
    public static void main(String[] args) {
        System.out.println("enter your number");
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper part of the pattern
        for(int i=0; i<n-1; i++){
            for (int l=0; l<i; l++) {
                System.out.print( " ");
             }
           for(int j=n; j>i; j--){
             
             System.out.print("* ");
             }
             System.out.println();
         }
         for(int i=1; i<n+1; i++){
             for(int k=n-1; k>=i; k--){
                 System.out.print(" ");
             }
             for(int j=1; j<=i; j++){
             System.out.print("* ");
             }
             System.out.println();
         }
    }
    
}

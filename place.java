import java.util.Scanner;

public class Place {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows for the pattern:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper part of the pattern
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int l = 0; l < i; l++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (int i = 1; i < n; i++) {
            // Print spaces
            for (int k = n - 1; k > i; k--) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

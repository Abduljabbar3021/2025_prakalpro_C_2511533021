package pekan5_2511533021;

import java.util.Scanner;

public class TugasFor1_2511533021 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        
        System.out.print("#");
        for (int i = 1; i <= n * 4; i++) {
            System.out.print("=");
        }
        System.out.println("#");
        
        for (int i = 1; i <= n; i++) {
            System.out.print("|");
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
          
            System.out.print("<>");
            
            for (int j = 1; j <= (i - 1) * 4; j++) {
                System.out.print(".");
            }
            
            System.out.print("<>");
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            System.out.println("|");
        }
        
        for (int i = n; i >= 1; i--) {
            System.out.print("|");
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            
            System.out.print("<>");
            
            for (int j = 1; j <= (i - 1) * 4; j++) {
                System.out.print(".");
            }

            System.out.print("<>");

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            System.out.println("|");
        }

        System.out.print("#");
        for (int i = 1; i <= n * 4; i++) {
            System.out.print("=");
        }
        System.out.println("#");

        input.close();
    }
}

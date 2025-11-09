package pekan6_2511533021;
import java.util.Random;
import java.util.Scanner;

public class Dadu_2511533021 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        int tries = 0;
        int sum = 0;
        String jawab = "ya";
        
        
        while (jawab.equalsIgnoreCase("ya") && sum != 7) {
            int dadu1 = rand.nextInt(6) + 1;
            int dadu2 = rand.nextInt(6) + 1;
            sum = dadu1 + dadu2;
            tries++;
            
            System.out.println(dadu1 + " + " + dadu2 + " = " + sum);
            
            if (sum == 7) {
                System.out.println("Tebakan Anda Benar");
                System.out.println("Anda menang setelah " + tries + " percobaan!");
                break;
            	} else {
                System.out.println("Tebakan Anda Salah");
                System.out.print("Apakah mau lempar dadu (ya / tidak?) ");
                jawab = input.next();
        }
        }
        	if (sum != 7) {
        		System.out.println("Anda gagal menang");
        		input.close();
        }
        }
}

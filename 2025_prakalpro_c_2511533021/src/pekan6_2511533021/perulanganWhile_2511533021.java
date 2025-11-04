package pekan6_2511533021;
import java.util.Scanner;
public class perulanganWhile_2511533021 {

	public static void main(String[] args) {
		int counter=0;
		String jawab;
		boolean running = true;
		Scanner scan = new Scanner  (System.in);
		while (running) {
			counter++;
			System.out.println("Jumlah = "+counter);
			System.out.println("Apakah lanjut (ya / tidak)");
			jawab= scan.nextLine ();
			if (jawab.equalsIgnoreCase("Tidak")) {
				running= false;
			}
			
		}
		System.out.println("Anda sudah melakukan perulangan sebanyak "+counter+"kali");
		scan.close();
	}

}

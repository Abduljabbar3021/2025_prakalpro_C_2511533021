package pekan4;

import java.util.Scanner;

public class NamaBulan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("masukkan angka bulan (1-12): ");
		int bulan = scanner.nextInt();
		switch (bulan) {
		case 1:
			System.out.println("januari");
			break;
		case 2:
			System.out.println("Februari");
			break;
		case 3:
			System.out.println("Maret");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("Mei");
			break;
			
		case 6:
			System.out.println("Juni");
			break;
		case 7:
			System.out.println("Juni");
			break;
		case 8:
			System.out.println("Juni");
			break;
		case 9:
			System.out.println("Juni");
			break;
		case 10:
			System.out.println("Juni");
			break;
		case 11:
			System.out.println("Juni");
			break;
		case 12:
			System.out.println("Juni");
			break;
			default:
				System.out.println("Angka tidak valid");
			
			
		}
		scanner.close();

	}

}

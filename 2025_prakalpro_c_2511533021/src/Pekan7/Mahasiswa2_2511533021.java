package Pekan7;

import java.util.Scanner;

public class Mahasiswa2_2511533021 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nim: ");
		String x= input.nextLine();
		System.out.print("Nama: ");
		String y= input.nextLine();
		Mahasiswa_2511533021 a= new Mahasiswa_2511533021 ();
		a.setNim2 (x);
		a.setNama (y);
		if(x.startsWith("25")) {
			System.out.println(y + "Anda angkatan 2025");
		}
		if(x.contains("1153")) {
			System.out.println("Anda mahasiswa informatika");
		}
		a.Cetak2();
		input.close();
	}

}

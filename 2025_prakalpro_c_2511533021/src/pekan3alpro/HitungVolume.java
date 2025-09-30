package pekan3alpro;

import java.util.Scanner;

public class HitungVolume {

	public static void main(String[] args) {
		double r;
		double VolumeBola;
		double phi = 3.14;
		Scanner keyboard = new Scanner (System.in); 
		System.out.print("input r atau jari-jari Bola: ");
		r = keyboard.nextDouble();
		keyboard.close();
		System.out.print("Rumus Volume Bola : 4.0/3.0 * phi * r * r * r ");
		VolumeBola = 4.0/3.0 * phi * r * r * r;
		System.out.println("Volume Bola Adalah = " +VolumeBola);

	}

}

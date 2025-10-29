package pekan4_2511533021;

import java.util.Scanner;

public class tugasAlproPekan4_2511533021 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        String nama;
        int jumlahTiket, hari, waktu, studio;
        double hargaDasar = 0, hargaPerTiket, subtotal, diskon = 0, totalBayar;
        double biayaHari, biayaWaktu, persentaseHari = 0, persentaseWaktu = 0;

        System.out.println("=== PEMBELIAN TIKET BIOSKOP ===");
        System.out.print("Nama Pembeli       : ");
        nama = input.nextLine();
        System.out.print("Jumlah Tiket       : ");
        jumlahTiket = input.nextInt();
        System.out.print("Hari (1=Senin-Kamis, 2=Jumat, 3=Sabtu-Minggu): ");
        hari = input.nextInt();
        System.out.print("Waktu (1=Pagi, 2=Siang, 3=Malam): ");
        waktu = input.nextInt();
        System.out.print("Studio (1=Regular, 2=Deluxe, 3=Premium): ");
        studio = input.nextInt();

        // Harga dasar berdasarkan studio
        switch (studio) {
            case 1:
                hargaDasar = 30000;
                break;
            case 2:
                hargaDasar = 50000;
                break;
            case 3:
                hargaDasar = 80000;
                break;
            default:
                System.out.println("Jenis studio tidak valid!");
                System.exit(0);
        }

        // Persentase biaya hari
        if (hari == 1) {
            persentaseHari = 0;
        } else if (hari == 2) {
            persentaseHari = 0.10;
        } else if (hari == 3) {
            persentaseHari = 0.30;
        }

        // Persentase biaya waktu
        if (waktu == 1) {
            persentaseWaktu = 0;
        } else if (waktu == 2) {
            persentaseWaktu = 0.10;
        } else if (waktu == 3) {
            persentaseWaktu = 0.20;
        }

        biayaHari = hargaDasar * persentaseHari;
        biayaWaktu = hargaDasar * persentaseWaktu;

        hargaPerTiket = hargaDasar + biayaHari + biayaWaktu;
        subtotal = hargaPerTiket * jumlahTiket;

        if (jumlahTiket > 3) {
            diskon = subtotal * 0.20;
        }

        totalBayar = subtotal - diskon;

        // Output
        System.out.println("\n===== PEMBELIAN TIKET BIOSKOP =====");
        System.out.println("Nama Pembeli    : " + nama);
        System.out.println("Jumlah Tiket    : " + jumlahTiket);

        String namaHari = (hari == 1) ? "Senin-Kamis" : (hari == 2) ? "Jumat" : "Sabtu-Minggu";
        String namaWaktu = (waktu == 1) ? "Pagi" : (waktu == 2) ? "Siang" : "Malam";
        String namaStudio = (studio == 1) ? "Regular" : (studio == 2) ? "Deluxe" : "Premium";

        System.out.println("Hari            : " + namaHari);
        System.out.println("Waktu Tayang    : " + namaWaktu);
        System.out.println("Jenis Studio    : " + namaStudio);
        System.out.println("------------------------------------");
        System.out.println("Harga Dasar     : Rp " + (int)hargaDasar + "/tiket");
        System.out.println("Biaya Hari      : +" + (int)(persentaseHari * 100) + "%");
        System.out.println("Biaya Waktu     : +" + (int)(persentaseWaktu * 100) + "%");
        System.out.println("Harga per Tiket : Rp " + (int)hargaPerTiket);
        System.out.println("Subtotal        : Rp " + (int)subtotal);
        System.out.println("Diskon (20%)    : Rp " + (int)diskon);
        System.out.println("------------------------------------");
        System.out.println("TOTAL BAYAR     : Rp " + (int)totalBayar);

        input.close();

	}

}
